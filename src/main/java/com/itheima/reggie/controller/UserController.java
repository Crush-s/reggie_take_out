package com.itheima.reggie.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.itheima.reggie.common.R;
import com.itheima.reggie.entity.User;
import com.itheima.reggie.service.UserService;
import com.itheima.reggie.utils.ValidateCodeUtils;
import java.util.Map;
import javax.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 发送手机短信验证码
     */
    @PostMapping("/sendMsg")
    public R<String> sendMsg(@RequestBody User user, HttpSession session) {
        //获取手机号
        String phone = user.getPhone();

        if (StringUtils.isNotEmpty(phone)) {
            //生成随机的4位验证码
            String code = ValidateCodeUtils.generateValidateCode(4).toString();
            log.info("code={}", code);

            //需要将生成的验证码保存到Session
            session.setAttribute(phone, code);

            return R.success("手机验证码短信发送成功");
        }

        return R.error("短信发送失败");
    }

    /**
     * 移动端用户登录
     */
    @PostMapping("/login")
    public R<User> login(@RequestBody Map map, HttpSession session) {
        log.info(map.toString());

        //获取手机号
        String phone = map.get("phone").toString();

        //获取验证码
        String code = map.get("code").toString();

        //从Session中获取保存的验证码
        Object codeInSession = session.getAttribute(phone);

        //进行验证码的比对（页面提交的验证码和Session中保存的验证码比对）
        if (codeInSession != null && codeInSession.equals(code)) {
            //如果能够比对成功，说明登录成功

            LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
            queryWrapper.eq(User::getPhone, phone);

            User user = userService.getOne(queryWrapper);
            session.setAttribute("user", user.getId());
            return R.success(user);
        }
        return R.error("登录失败");
    }

    /**
     * 移动端用户注册
     */
    @PostMapping("/register")
    public R<User> register(@RequestBody Map<String, String> map, HttpSession session) {
        log.info(map.toString());

        //获取手机号
        String phone = map.get("phone").toString();
        //获取验证码
        String code = map.get("code").toString();

        //从Session中获取保存的验证码
        Object codeInSession = session.getAttribute(phone);

        //进行验证码的比对（页面提交的验证码和Session中保存的验证码比对）
        if (codeInSession != null && codeInSession.equals(code)) {
            //如果能够比对成功，说明手机号正确

            LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
            queryWrapper.eq(User::getPhone, phone);

            User user = userService.getOne(queryWrapper);
            if (user == null) {
                //判断当前手机号对应的用户是否为新用户，如果是新用户就自动完成注册
                user = new User();
                user.setSex(map.get("sex"));
                user.setName(map.get("name"));
                user.setIdNumber(map.get("idNumber"));
                user.setAvatar(map.get("avatar"));
                user.setUserFortunellaVenosa(map.get("userFortunellaVenosa"));
                user.setPhone(phone);
                user.setStatus(1);
                userService.save(user);
                session.setAttribute("user", user.getId());
                return R.success(user);
            }

            return R.error("用户已经存在");
        }
        return R.error("验证码错误");
    }

    /**
     * 移动端用户信息修改
     */
    @PostMapping("/update")
    public R<User> update(@RequestBody Map<String, String> map, HttpSession session) {
        log.info(map.toString());

        //获取用户id
        String id = map.get("id");

        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getId, id);

        User user = userService.getOne(queryWrapper);

        if (user == null) {
            return R.error("用户不存在");
        }

        //获取手机号
        String phone = map.get("phone");
        if (!StringUtils.equals(user.getPhone(), phone)) {
            //获取验证码
            String code = map.get("code");

            //从Session中获取保存的验证码
            Object codeInSession = session.getAttribute(phone);

            //进行验证码的比对（页面提交的验证码和Session中保存的验证码比对）
            if (codeInSession != null && codeInSession.equals(code)) {
                boolean a = true;
            } else {
                return R.error("验证码错误");
            }
        }
        user.setSex(map.get("sex"));
        user.setName(map.get("name"));
        user.setIdNumber(map.get("idNumber"));
        user.setAvatar(map.get("avatar"));
        user.setUserFortunellaVenosa(map.get("userFortunellaVenosa"));
        user.setPhone(phone);
        user.setStatus(Integer.getInteger(map.get("status")));
        userService.updateById(user);
        session.setAttribute("user", user.getId());
        return R.success(user);
    }

}

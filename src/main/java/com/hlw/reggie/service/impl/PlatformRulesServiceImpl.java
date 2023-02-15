package com.hlw.reggie.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hlw.reggie.common.R;
import com.hlw.reggie.mapper.PlatformRulesMapper;
import com.hlw.reggie.entity.PlatformRules;
import com.hlw.reggie.service.PlatformRulesService;
import org.springframework.stereotype.Service;

/**
 * @description 针对表【platform_rules(平台规则)】的数据库操作Service实现
 */
@Service
public class PlatformRulesServiceImpl extends ServiceImpl<PlatformRulesMapper, PlatformRules>
        implements PlatformRulesService {

    @Override
    public R<PlatformRules> select(PlatformRules platformRules) {
        // 添加数据可用条件
        platformRules.setState(0);
        return R.success(baseMapper.selectOne(
                new LambdaQueryWrapper<PlatformRules>().setEntity(platformRules)));
    }
}





package com.hlw.reggie.controller;

import com.hlw.reggie.common.R;
import com.hlw.reggie.entity.PlatformRules;
import com.hlw.reggie.service.PlatformRulesService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 平台规则相关接口
 */
@Slf4j
@RestController
@RequestMapping("/platformRules")
@AllArgsConstructor
public class PlatformRulesController {

    private final PlatformRulesService platformRulesService;

    /**
     * 查询平台规则
     *
     * @param platformRules 条件
     * @return 返回结果
     */
    @GetMapping("select")
    public R<PlatformRules> select(PlatformRules platformRules) {
        return platformRulesService.select(platformRules);
    }

    // 管理

}

package com.hlw.reggie.service;

import com.hlw.reggie.common.R;
import com.hlw.reggie.entity.PlatformRules;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @description 针对表【platform_rules(平台规则)】的数据库操作Service
 */
public interface PlatformRulesService extends IService<PlatformRules> {

    R<PlatformRules> select(PlatformRules platformRules);
}

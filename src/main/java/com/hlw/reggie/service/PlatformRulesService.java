package com.hlw.reggie.service;

import com.hlw.reggie.common.R;
import com.hlw.reggie.entity.PlatformRules;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author hlw
* @description 针对表【platform_rules(平台规则)】的数据库操作Service
* @createDate 2023-02-09 10:35:09
*/
public interface PlatformRulesService extends IService<PlatformRules> {

    R<PlatformRules> select(PlatformRules platformRules);
}

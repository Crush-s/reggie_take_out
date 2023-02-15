package com.hlw.reggie.service;

import com.hlw.reggie.common.R;
import com.hlw.reggie.entity.HotSearch;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hlw.reggie.entity.PlatformRules;

/**
 * @description 针对表【hot_search(热搜信息)】的数据库操作Service
 */
public interface HotSearchService extends IService<HotSearch> {

    R<PlatformRules> select();

    boolean saveOrUpdateByTable(HotSearch hotSearch);

}

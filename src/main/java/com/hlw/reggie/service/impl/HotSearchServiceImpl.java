package com.hlw.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hlw.reggie.common.R;
import com.hlw.reggie.entity.HotSearch;
import com.hlw.reggie.entity.PlatformRules;
import com.hlw.reggie.service.HotSearchService;
import com.hlw.reggie.mapper.HotSearchMapper;
import org.springframework.stereotype.Service;

/**
* @author hlw
* @description 针对表【hot_search(热搜信息)】的数据库操作Service实现
* @createDate 2023-02-09 14:30:33
*/
@Service
public class HotSearchServiceImpl extends ServiceImpl<HotSearchMapper, HotSearch>
    implements HotSearchService{

    @Override
    public R<PlatformRules> select() {
        return null;
    }

    @Override
    public boolean saveOrUpdateByTable(HotSearch hotSearch) {
        return baseMapper.saveOrUpdateByTable(hotSearch);
    }
}





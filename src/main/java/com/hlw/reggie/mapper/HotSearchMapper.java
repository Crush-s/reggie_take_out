package com.hlw.reggie.mapper;

import com.hlw.reggie.entity.HotSearch;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author hlw
 * @description 针对表【hot_search(热搜信息)】的数据库操作Mapper
 * @createDate 2023-02-09 14:30:33
 * @Entity com.hlw.reggie.entity.HotSearch
 */
@Mapper
public interface HotSearchMapper extends BaseMapper<HotSearch> {

    boolean saveOrUpdateByTable(HotSearch hotSearch);
}





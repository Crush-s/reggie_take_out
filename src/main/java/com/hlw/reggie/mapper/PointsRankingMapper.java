package com.hlw.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hlw.reggie.entity.PointsRanking;
import org.apache.ibatis.annotations.Mapper;

/**
 * @description 针对表【points_ranking(球队积分排名)】的数据库操作Mapper
 */
@Mapper
public interface PointsRankingMapper extends BaseMapper<PointsRanking> {

}





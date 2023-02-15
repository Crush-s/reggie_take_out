package com.hlw.reggie.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hlw.reggie.common.R;
import com.hlw.reggie.entity.PointsRanking;

/**
 * @description 针对表【points_ranking(球队积分排名)】的数据库操作Service
 */
public interface PointsRankingService extends IService<PointsRanking> {

    R<Page<PointsRanking>> getAllPointsRanking(PointsRanking pointsRanking,
            Page<PointsRanking> pointsRankingPage);

    R<PointsRanking> getPointsRankingById(Long id);

    R<PointsRanking> createPointsRanking(PointsRanking pointsRanking);

    R<PointsRanking> updatePointsRanking(PointsRanking pointsRanking);

    R<String> deletePointsRanking(Long id);
}

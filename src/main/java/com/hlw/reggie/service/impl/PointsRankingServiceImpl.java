package com.hlw.reggie.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hlw.reggie.common.R;
import com.hlw.reggie.entity.PointsRanking;
import com.hlw.reggie.mapper.PointsRankingMapper;
import com.hlw.reggie.service.PointsRankingService;
import org.springframework.stereotype.Service;

/**
 * @description 针对表【points_ranking(球队积分排名)】的数据库操作Service实现
 */
@Service
public class PointsRankingServiceImpl extends ServiceImpl<PointsRankingMapper, PointsRanking>
        implements PointsRankingService {

    @Override
    public R<Page<PointsRanking>> getAllPointsRanking(PointsRanking pointsRanking,
            Page<PointsRanking> pointsRankingPage) {
        return R.success("查询成功！", page(pointsRankingPage,
                new LambdaQueryWrapper<PointsRanking>().setEntity(pointsRanking)));
    }

    @Override
    public R<PointsRanking> getPointsRankingById(Long id) {
        return R.success("查询成功！", getById(id));
    }

    @Override
    public R<PointsRanking> createPointsRanking(PointsRanking pointsRanking) {
        save(pointsRanking);
        return R.success("新建成功！", pointsRanking);
    }

    @Override
    public R<PointsRanking> updatePointsRanking(PointsRanking pointsRanking) {
        updateById(pointsRanking);
        return R.success("修改成功！", pointsRanking);
    }

    @Override
    public R<String> deletePointsRanking(Long id) {
        boolean b = removeById(id);
        return R.success(Boolean.toString(b), "删除成功！");
    }
}





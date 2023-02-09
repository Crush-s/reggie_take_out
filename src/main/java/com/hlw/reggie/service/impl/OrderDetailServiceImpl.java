package com.hlw.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hlw.reggie.entity.OrderDetail;
import com.hlw.reggie.mapper.OrderDetailMapper;
import com.hlw.reggie.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements
        OrderDetailService {

}

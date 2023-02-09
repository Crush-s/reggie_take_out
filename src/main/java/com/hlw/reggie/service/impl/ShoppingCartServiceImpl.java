package com.hlw.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hlw.reggie.entity.ShoppingCart;
import com.hlw.reggie.mapper.ShoppingCartMapper;
import com.hlw.reggie.service.ShoppingCartService;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements
        ShoppingCartService {

}

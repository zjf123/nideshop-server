package com.hunhot.nideshop.biz.impl;

import com.hunhot.nideshop.dao.NideshopCartMapper;
import com.hunhot.nideshop.entity.NideshopCart;
import com.hunhot.nideshop.biz.CartBiz;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartBizImpl implements CartBiz {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    // 注入Service依赖
    @Autowired
    private NideshopCartMapper nideshopCartMapper;

    @Override
    public List<NideshopCart> selectCartByCondition(NideshopCart cart, int offset, int limit) {
        cart.setLimit(limit);
        cart.setOffset(offset);
        return nideshopCartMapper.selectCartByCondition(cart);
    }
}

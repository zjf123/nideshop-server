package com.hunhot.nideshop.service.impl;

import com.hunhot.nideshop.dto.Result;
import com.hunhot.nideshop.entity.*;
import com.hunhot.nideshop.service.*;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Service
public class CartContServiceImpl implements CartContService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    // 注入Service依赖
    @Autowired
    private CartService cartService;
    @Autowired
    private GoodsService goodsService;

    @Override
    public Result<HashMap> getIndexData() {
        return getCart();
    }

    @Override
    public Result<HashMap> getCart() {

        NideshopCart cart = new NideshopCart();
        cart.setSessionId("1");
        cart.setUserId(0);//think.userId=> TODO BY LL session中获取
        List<NideshopCart> cartList = cartService.selectCartByCondition(cart, 0, 0);

        // 获取购物车统计信息
        int goodsCount = 0;
        BigDecimal goodsAmount = new BigDecimal(0.00);
        int checkedGoodsCount = 0;
        BigDecimal checkedGoodsAmount = new BigDecimal(0.00);

        for (NideshopCart cartItem : cartList) {
            goodsCount += cartItem.getNumber();
            goodsAmount = goodsAmount.add(cartItem.getRetailPrice().multiply(new BigDecimal(cartItem.getNumber().intValue())));
            if (0 != cartItem.getChecked()) {
                checkedGoodsCount += cartItem.getNumber();
                checkedGoodsAmount = checkedGoodsAmount.add(cartItem.getRetailPrice().multiply(new BigDecimal(cartItem.getNumber().intValue())));
            }

            // 查找商品的图片
            NideshopGoods goodsList = goodsService.selectGoodsById(cartItem.getGoodsId());
            if(null!=goodsList && StringUtils.isNotEmpty(goodsList.getListPicUrl())){
                cartItem.setListPicUrl(goodsList.getListPicUrl());
            }
        }

        Result<HashMap> result = new Result<>();
        result.setData(new HashMap());
        result.getData().put("cartList", cartList);

        Map<String,Object> cartTotal = new HashMap<>();
        cartTotal.put("goodsCount",goodsCount);
        cartTotal.put("goodsAmount",goodsAmount);
        cartTotal.put("checkedGoodsCount",checkedGoodsCount);
        cartTotal.put("checkedGoodsAmount",checkedGoodsAmount);
        result.getData().put("cartTotal",cartTotal);

        return null;
    }
}

package com.hunhot.nideshop.dao;

import com.hunhot.nideshop.entity.NideshopRelatedGoods;

public interface NideshopRelatedGoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NideshopRelatedGoods record);

    int insertSelective(NideshopRelatedGoods record);

    NideshopRelatedGoods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NideshopRelatedGoods record);

    int updateByPrimaryKey(NideshopRelatedGoods record);
}
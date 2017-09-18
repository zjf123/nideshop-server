package com.hunhot.nideshop.dao;

import com.hunhot.nideshop.entity.NideshopOrderGoods;

public interface NideshopOrderGoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NideshopOrderGoods record);

    int insertSelective(NideshopOrderGoods record);

    NideshopOrderGoods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NideshopOrderGoods record);

    int updateByPrimaryKeyWithBLOBs(NideshopOrderGoods record);

    int updateByPrimaryKey(NideshopOrderGoods record);
}
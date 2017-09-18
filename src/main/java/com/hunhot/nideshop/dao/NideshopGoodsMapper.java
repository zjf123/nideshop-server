package com.hunhot.nideshop.dao;

import com.hunhot.nideshop.entity.NideshopGoods;

public interface NideshopGoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NideshopGoods record);

    int insertSelective(NideshopGoods record);

    NideshopGoods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NideshopGoods record);

    int updateByPrimaryKeyWithBLOBs(NideshopGoods record);

    int updateByPrimaryKey(NideshopGoods record);
}
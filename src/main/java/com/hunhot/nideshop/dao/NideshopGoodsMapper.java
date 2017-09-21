package com.hunhot.nideshop.dao;

import com.hunhot.nideshop.entity.NideshopGoods;

import java.util.List;

public interface NideshopGoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NideshopGoods record);

    int insertSelective(NideshopGoods record);

    NideshopGoods selectByPrimaryKey(Integer id);

    List<NideshopGoods> selectGoodsByCondition(NideshopGoods goods);

    int updateByPrimaryKeySelective(NideshopGoods record);

    int updateByPrimaryKeyWithBLOBs(NideshopGoods record);

    int updateByPrimaryKey(NideshopGoods record);
}
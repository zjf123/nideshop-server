package com.hunhot.nideshop.dao;

import com.hunhot.nideshop.entity.NideshopGoodsAttribute;

public interface NideshopGoodsAttributeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NideshopGoodsAttribute record);

    int insertSelective(NideshopGoodsAttribute record);

    NideshopGoodsAttribute selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NideshopGoodsAttribute record);

    int updateByPrimaryKeyWithBLOBs(NideshopGoodsAttribute record);

    int updateByPrimaryKey(NideshopGoodsAttribute record);
}
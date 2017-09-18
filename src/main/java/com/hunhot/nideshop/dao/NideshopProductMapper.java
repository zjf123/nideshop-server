package com.hunhot.nideshop.dao;

import com.hunhot.nideshop.entity.NideshopProduct;

public interface NideshopProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NideshopProduct record);

    int insertSelective(NideshopProduct record);

    NideshopProduct selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NideshopProduct record);

    int updateByPrimaryKey(NideshopProduct record);
}
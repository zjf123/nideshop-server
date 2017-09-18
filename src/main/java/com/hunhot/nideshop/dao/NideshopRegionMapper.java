package com.hunhot.nideshop.dao;

import com.hunhot.nideshop.entity.NideshopRegion;

public interface NideshopRegionMapper {
    int deleteByPrimaryKey(Short id);

    int insert(NideshopRegion record);

    int insertSelective(NideshopRegion record);

    NideshopRegion selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(NideshopRegion record);

    int updateByPrimaryKey(NideshopRegion record);
}
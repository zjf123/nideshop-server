package com.hunhot.nideshop.dao;

import com.hunhot.nideshop.entity.NideshopFootprint;

public interface NideshopFootprintMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NideshopFootprint record);

    int insertSelective(NideshopFootprint record);

    NideshopFootprint selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NideshopFootprint record);

    int updateByPrimaryKey(NideshopFootprint record);
}
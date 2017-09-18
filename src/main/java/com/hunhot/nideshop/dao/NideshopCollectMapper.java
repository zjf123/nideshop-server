package com.hunhot.nideshop.dao;

import com.hunhot.nideshop.entity.NideshopCollect;

public interface NideshopCollectMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NideshopCollect record);

    int insertSelective(NideshopCollect record);

    NideshopCollect selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NideshopCollect record);

    int updateByPrimaryKey(NideshopCollect record);
}
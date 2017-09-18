package com.hunhot.nideshop.dao;

import com.hunhot.nideshop.entity.NideshopCart;

public interface NideshopCartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NideshopCart record);

    int insertSelective(NideshopCart record);

    NideshopCart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NideshopCart record);

    int updateByPrimaryKeyWithBLOBs(NideshopCart record);

    int updateByPrimaryKey(NideshopCart record);
}
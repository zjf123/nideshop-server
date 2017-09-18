package com.hunhot.nideshop.dao;

import com.hunhot.nideshop.entity.NideshopAddress;

public interface NideshopAddressMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NideshopAddress record);

    int insertSelective(NideshopAddress record);

    NideshopAddress selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NideshopAddress record);

    int updateByPrimaryKey(NideshopAddress record);
}
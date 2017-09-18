package com.hunhot.nideshop.dao;

import com.hunhot.nideshop.entity.NideshopUser;

public interface NideshopUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NideshopUser record);

    int insertSelective(NideshopUser record);

    NideshopUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NideshopUser record);

    int updateByPrimaryKey(NideshopUser record);
}
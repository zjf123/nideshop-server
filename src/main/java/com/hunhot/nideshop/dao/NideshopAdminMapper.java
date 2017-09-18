package com.hunhot.nideshop.dao;

import com.hunhot.nideshop.entity.NideshopAdmin;

public interface NideshopAdminMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NideshopAdmin record);

    int insertSelective(NideshopAdmin record);

    NideshopAdmin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NideshopAdmin record);

    int updateByPrimaryKey(NideshopAdmin record);
}
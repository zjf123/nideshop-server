package com.hunhot.nideshop.dao;

import com.hunhot.nideshop.entity.NideshopUserLevel;

public interface NideshopUserLevelMapper {
    int deleteByPrimaryKey(Byte id);

    int insert(NideshopUserLevel record);

    int insertSelective(NideshopUserLevel record);

    NideshopUserLevel selectByPrimaryKey(Byte id);

    int updateByPrimaryKeySelective(NideshopUserLevel record);

    int updateByPrimaryKey(NideshopUserLevel record);
}
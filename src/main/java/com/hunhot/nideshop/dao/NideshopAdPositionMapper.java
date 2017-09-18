package com.hunhot.nideshop.dao;

import com.hunhot.nideshop.entity.NideshopAdPosition;

public interface NideshopAdPositionMapper {
    int deleteByPrimaryKey(Byte id);

    int insert(NideshopAdPosition record);

    int insertSelective(NideshopAdPosition record);

    NideshopAdPosition selectByPrimaryKey(Byte id);

    int updateByPrimaryKeySelective(NideshopAdPosition record);

    int updateByPrimaryKey(NideshopAdPosition record);
}
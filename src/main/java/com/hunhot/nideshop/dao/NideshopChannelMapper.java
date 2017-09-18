package com.hunhot.nideshop.dao;

import com.hunhot.nideshop.entity.NideshopChannel;

public interface NideshopChannelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NideshopChannel record);

    int insertSelective(NideshopChannel record);

    NideshopChannel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NideshopChannel record);

    int updateByPrimaryKey(NideshopChannel record);
}
package com.hunhot.nideshop.dao;

import com.hunhot.nideshop.entity.NideshopChannel;

import java.util.List;

public interface NideshopChannelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NideshopChannel record);

    int insertSelective(NideshopChannel record);

    NideshopChannel selectByPrimaryKey(Integer id);

    List<NideshopChannel> selectAllChannels();

    int updateByPrimaryKeySelective(NideshopChannel record);

    int updateByPrimaryKey(NideshopChannel record);
}
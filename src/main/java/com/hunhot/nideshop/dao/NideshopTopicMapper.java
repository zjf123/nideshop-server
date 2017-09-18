package com.hunhot.nideshop.dao;

import com.hunhot.nideshop.entity.NideshopTopic;

public interface NideshopTopicMapper {
    int insert(NideshopTopic record);

    int insertSelective(NideshopTopic record);
}
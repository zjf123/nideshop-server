package com.hunhot.nideshop.dao;

import com.hunhot.nideshop.entity.NideshopTopic;

import java.util.List;

public interface NideshopTopicMapper {
    int insert(NideshopTopic record);

    int insertSelective(NideshopTopic record);

    List<NideshopTopic> selectTopicsByCondition(NideshopTopic brand);

}
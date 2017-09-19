package com.hunhot.nideshop.dao;

import com.hunhot.nideshop.entity.NideshopTopic;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NideshopTopicMapper {
    int insert(NideshopTopic record);

    int insertSelective(NideshopTopic record);

    List<NideshopTopic> selectTopicsByCondition(NideshopTopic brand, @Param("offset") int offset, @Param("limit") int limit);

}
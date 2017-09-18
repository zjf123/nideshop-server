package com.hunhot.nideshop.dao;

import com.hunhot.nideshop.entity.NideshopTopicCategory;

public interface NideshopTopicCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NideshopTopicCategory record);

    int insertSelective(NideshopTopicCategory record);

    NideshopTopicCategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NideshopTopicCategory record);

    int updateByPrimaryKey(NideshopTopicCategory record);
}
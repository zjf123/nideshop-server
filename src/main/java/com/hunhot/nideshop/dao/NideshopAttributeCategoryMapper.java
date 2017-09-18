package com.hunhot.nideshop.dao;

import com.hunhot.nideshop.entity.NideshopAttributeCategory;

public interface NideshopAttributeCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NideshopAttributeCategory record);

    int insertSelective(NideshopAttributeCategory record);

    NideshopAttributeCategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NideshopAttributeCategory record);

    int updateByPrimaryKey(NideshopAttributeCategory record);
}
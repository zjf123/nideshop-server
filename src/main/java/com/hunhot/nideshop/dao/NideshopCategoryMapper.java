package com.hunhot.nideshop.dao;

import com.hunhot.nideshop.entity.NideshopCategory;

public interface NideshopCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NideshopCategory record);

    int insertSelective(NideshopCategory record);

    NideshopCategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NideshopCategory record);

    int updateByPrimaryKey(NideshopCategory record);
}
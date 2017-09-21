package com.hunhot.nideshop.dao;

import com.hunhot.nideshop.entity.NideshopCategory;

import java.util.List;

public interface NideshopCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NideshopCategory record);

    int insertSelective(NideshopCategory record);

    NideshopCategory selectByPrimaryKey(Integer id);

    List<NideshopCategory> selectCategorysByCondition(NideshopCategory category);

    int updateByPrimaryKeySelective(NideshopCategory record);

    int updateByPrimaryKey(NideshopCategory record);

    List<Integer> selectCategoryIdsByCondition(NideshopCategory category);
}
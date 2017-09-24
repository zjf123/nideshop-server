package com.hunhot.nideshop.dao;

import com.hunhot.nideshop.entity.NideshopCollect;

import java.util.List;

public interface NideshopCollectMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NideshopCollect record);

    int insertSelective(NideshopCollect record);

    NideshopCollect selectByPrimaryKey(Integer id);

    List<NideshopCollect> selectCollectsByCondition(NideshopCollect collect);

    List<NideshopCollect> selectCollectsRelationGoodsByCondition(NideshopCollect collect);

    int updateByPrimaryKeySelective(NideshopCollect record);

    int updateByPrimaryKey(NideshopCollect record);
}
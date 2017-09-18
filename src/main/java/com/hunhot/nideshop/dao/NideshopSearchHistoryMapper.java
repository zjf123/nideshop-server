package com.hunhot.nideshop.dao;

import com.hunhot.nideshop.entity.NideshopSearchHistory;

public interface NideshopSearchHistoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NideshopSearchHistory record);

    int insertSelective(NideshopSearchHistory record);

    NideshopSearchHistory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NideshopSearchHistory record);

    int updateByPrimaryKey(NideshopSearchHistory record);
}
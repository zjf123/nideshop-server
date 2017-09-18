package com.hunhot.nideshop.dao;

import com.hunhot.nideshop.entity.NideshopKeywords;
import com.hunhot.nideshop.entity.NideshopKeywordsKey;

public interface NideshopKeywordsMapper {
    int deleteByPrimaryKey(NideshopKeywordsKey key);

    int insert(NideshopKeywords record);

    int insertSelective(NideshopKeywords record);

    NideshopKeywords selectByPrimaryKey(NideshopKeywordsKey key);

    int updateByPrimaryKeySelective(NideshopKeywords record);

    int updateByPrimaryKey(NideshopKeywords record);
}
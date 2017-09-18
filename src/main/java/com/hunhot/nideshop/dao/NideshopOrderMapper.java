package com.hunhot.nideshop.dao;

import com.hunhot.nideshop.entity.NideshopOrder;

public interface NideshopOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NideshopOrder record);

    int insertSelective(NideshopOrder record);

    NideshopOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NideshopOrder record);

    int updateByPrimaryKey(NideshopOrder record);
}
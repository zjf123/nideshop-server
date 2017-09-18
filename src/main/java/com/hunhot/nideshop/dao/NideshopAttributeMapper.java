package com.hunhot.nideshop.dao;

import com.hunhot.nideshop.entity.NideshopAttribute;

public interface NideshopAttributeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NideshopAttribute record);

    int insertSelective(NideshopAttribute record);

    NideshopAttribute selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NideshopAttribute record);

    int updateByPrimaryKeyWithBLOBs(NideshopAttribute record);

    int updateByPrimaryKey(NideshopAttribute record);
}
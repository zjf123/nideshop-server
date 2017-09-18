package com.hunhot.nideshop.dao;

import com.hunhot.nideshop.entity.NideshopBrand;

public interface NideshopBrandMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NideshopBrand record);

    int insertSelective(NideshopBrand record);

    NideshopBrand selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NideshopBrand record);

    int updateByPrimaryKey(NideshopBrand record);
}
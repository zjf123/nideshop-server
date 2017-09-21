package com.hunhot.nideshop.dao;

import com.hunhot.nideshop.entity.NideshopBrand;

import java.util.List;

public interface NideshopBrandMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NideshopBrand record);

    int insertSelective(NideshopBrand record);

    NideshopBrand selectByPrimaryKey(Integer id);

    List<NideshopBrand> selectBrandsByCondition(NideshopBrand brand);


    int updateByPrimaryKeySelective(NideshopBrand record);

    int updateByPrimaryKey(NideshopBrand record);
}
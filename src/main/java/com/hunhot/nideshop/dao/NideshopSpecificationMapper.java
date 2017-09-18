package com.hunhot.nideshop.dao;

import com.hunhot.nideshop.entity.NideshopSpecification;

public interface NideshopSpecificationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NideshopSpecification record);

    int insertSelective(NideshopSpecification record);

    NideshopSpecification selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NideshopSpecification record);

    int updateByPrimaryKey(NideshopSpecification record);
}
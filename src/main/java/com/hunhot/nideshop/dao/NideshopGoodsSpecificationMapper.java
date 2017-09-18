package com.hunhot.nideshop.dao;

import com.hunhot.nideshop.entity.NideshopGoodsSpecification;

public interface NideshopGoodsSpecificationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NideshopGoodsSpecification record);

    int insertSelective(NideshopGoodsSpecification record);

    NideshopGoodsSpecification selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NideshopGoodsSpecification record);

    int updateByPrimaryKey(NideshopGoodsSpecification record);
}
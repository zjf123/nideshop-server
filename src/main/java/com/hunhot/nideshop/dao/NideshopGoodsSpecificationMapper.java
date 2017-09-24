package com.hunhot.nideshop.dao;

import com.hunhot.nideshop.entity.NideshopGoodsSpecification;
import com.sun.tools.javac.util.List;

public interface NideshopGoodsSpecificationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NideshopGoodsSpecification record);

    int insertSelective(NideshopGoodsSpecification record);

    NideshopGoodsSpecification selectByPrimaryKey(Integer id);

    List<NideshopGoodsSpecification> selectNideshopGoodsSpecificationByCondition(NideshopGoodsSpecification goodsSpecification);

    int updateByPrimaryKeySelective(NideshopGoodsSpecification record);

    int updateByPrimaryKey(NideshopGoodsSpecification record);
}
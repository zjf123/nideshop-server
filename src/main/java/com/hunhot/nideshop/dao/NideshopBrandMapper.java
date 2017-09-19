package com.hunhot.nideshop.dao;

import com.hunhot.nideshop.entity.NideshopBrand;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NideshopBrandMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NideshopBrand record);

    int insertSelective(NideshopBrand record);

    NideshopBrand selectByPrimaryKey(Integer id);

    List<NideshopBrand> selectBrandsByCondition(NideshopBrand brand, @Param("offset") int offset, @Param("limit") int limit);


    int updateByPrimaryKeySelective(NideshopBrand record);

    int updateByPrimaryKey(NideshopBrand record);
}
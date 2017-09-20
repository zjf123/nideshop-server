package com.hunhot.nideshop.dao;

import com.hunhot.nideshop.entity.NideshopCart;
import com.hunhot.nideshop.entity.NideshopGoods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NideshopCartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NideshopCart record);

    int insertSelective(NideshopCart record);

    NideshopCart selectByPrimaryKey(Integer id);

    List<NideshopCart> selectCartByCondition(NideshopCart goods);

    int updateByPrimaryKeySelective(NideshopCart record);

    int updateByPrimaryKeyWithBLOBs(NideshopCart record);

    int updateByPrimaryKey(NideshopCart record);
}
package com.hunhot.nideshop.dao;

import com.hunhot.nideshop.entity.NideshopGoods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NideshopGoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NideshopGoods record);

    int insertSelective(NideshopGoods record);

    NideshopGoods selectByPrimaryKey(Integer id);

    List<NideshopGoods> selectGoodsByCondition(NideshopGoods goods,@Param("offset") int offset, @Param("limit") int limit);

    int updateByPrimaryKeySelective(NideshopGoods record);

    int updateByPrimaryKeyWithBLOBs(NideshopGoods record);

    int updateByPrimaryKey(NideshopGoods record);
}
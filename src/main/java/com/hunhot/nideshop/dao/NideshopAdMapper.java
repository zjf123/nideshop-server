package com.hunhot.nideshop.dao;

import com.hunhot.nideshop.entity.NideshopAd;

public interface NideshopAdMapper {
    int deleteByPrimaryKey(Short id);

    int insert(NideshopAd record);

    int insertSelective(NideshopAd record);

    NideshopAd selectByPrimaryKey(Short id);

    NideshopAd selectByAdPositionId(Short adPositionId);

    int updateByPrimaryKeySelective(NideshopAd record);

    int updateByPrimaryKeyWithBLOBs(NideshopAd record);

    int updateByPrimaryKey(NideshopAd record);
}
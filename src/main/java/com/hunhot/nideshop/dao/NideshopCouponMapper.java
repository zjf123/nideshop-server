package com.hunhot.nideshop.dao;

import com.hunhot.nideshop.entity.NideshopCoupon;

public interface NideshopCouponMapper {
    int deleteByPrimaryKey(Short id);

    int insert(NideshopCoupon record);

    int insertSelective(NideshopCoupon record);

    NideshopCoupon selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(NideshopCoupon record);

    int updateByPrimaryKey(NideshopCoupon record);
}
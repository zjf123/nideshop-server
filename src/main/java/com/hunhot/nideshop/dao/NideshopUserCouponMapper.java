package com.hunhot.nideshop.dao;

import com.hunhot.nideshop.entity.NideshopUserCoupon;

public interface NideshopUserCouponMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NideshopUserCoupon record);

    int insertSelective(NideshopUserCoupon record);

    NideshopUserCoupon selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NideshopUserCoupon record);

    int updateByPrimaryKey(NideshopUserCoupon record);
}
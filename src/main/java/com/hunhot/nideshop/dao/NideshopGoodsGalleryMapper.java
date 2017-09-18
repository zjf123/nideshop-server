package com.hunhot.nideshop.dao;

import com.hunhot.nideshop.entity.NideshopGoodsGallery;

public interface NideshopGoodsGalleryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NideshopGoodsGallery record);

    int insertSelective(NideshopGoodsGallery record);

    NideshopGoodsGallery selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NideshopGoodsGallery record);

    int updateByPrimaryKey(NideshopGoodsGallery record);
}
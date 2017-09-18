package com.hunhot.nideshop.dao;

import com.hunhot.nideshop.entity.NideshopCommentPicture;

public interface NideshopCommentPictureMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NideshopCommentPicture record);

    int insertSelective(NideshopCommentPicture record);

    NideshopCommentPicture selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NideshopCommentPicture record);

    int updateByPrimaryKey(NideshopCommentPicture record);
}
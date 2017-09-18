package com.hunhot.nideshop.dao;

import com.hunhot.nideshop.entity.NideshopComment;

public interface NideshopCommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NideshopComment record);

    int insertSelective(NideshopComment record);

    NideshopComment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NideshopComment record);

    int updateByPrimaryKey(NideshopComment record);
}
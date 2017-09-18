package com.hunhot.nideshop.dao;

import com.hunhot.nideshop.entity.NideshopFeedback;

public interface NideshopFeedbackMapper {
    int deleteByPrimaryKey(Integer msgId);

    int insert(NideshopFeedback record);

    int insertSelective(NideshopFeedback record);

    NideshopFeedback selectByPrimaryKey(Integer msgId);

    int updateByPrimaryKeySelective(NideshopFeedback record);

    int updateByPrimaryKeyWithBLOBs(NideshopFeedback record);

    int updateByPrimaryKey(NideshopFeedback record);
}
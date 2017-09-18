package com.hunhot.nideshop.dao;

import com.hunhot.nideshop.entity.NideshopGoodsIssue;

public interface NideshopGoodsIssueMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NideshopGoodsIssue record);

    int insertSelective(NideshopGoodsIssue record);

    NideshopGoodsIssue selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NideshopGoodsIssue record);

    int updateByPrimaryKeyWithBLOBs(NideshopGoodsIssue record);

    int updateByPrimaryKey(NideshopGoodsIssue record);
}
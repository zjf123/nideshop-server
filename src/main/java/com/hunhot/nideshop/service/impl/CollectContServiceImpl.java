package com.hunhot.nideshop.service.impl;

import com.hunhot.nideshop.biz.CollectBiz;
import com.hunhot.nideshop.utils.Result;
import com.hunhot.nideshop.entity.NideshopCollect;
import com.hunhot.nideshop.service.CollectContService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class CollectContServiceImpl implements CollectContService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    // 注入Service依赖
    @Autowired
    private CollectBiz collectBiz;

    @Override
    public Result<HashMap> getListData(int typeId) {
        Result<HashMap> result = new Result<HashMap>();
        result.setData(new HashMap());

        NideshopCollect collect = new NideshopCollect();
        collect.setTypeId(typeId);
        collect.setUserId(0);// TODO by 从session中获取userId
        result.getData().put("list", collectBiz.selectCollectsRelationGoodsByCondition(collect,0,0));

        return result;
    }

    @Override
    public Result<HashMap> getAddordeleteData(int typeId, int valueId) {
        return null;
    }


}

package com.hunhot.nideshop.service.impl;

import com.hunhot.nideshop.biz.GoodsBiz;
import com.hunhot.nideshop.utils.Result;
import com.hunhot.nideshop.entity.*;
import com.hunhot.nideshop.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class GoodsContServiceImpl implements GoodsContService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    // 注入Service依赖
    @Autowired
    private GoodsSpecificationService goodsSpecificationService;
    @Autowired
    private GoodsBiz goodsBiz;

    @Override
    public Result<HashMap> getIndexData() {
        Result<HashMap> result = new Result<HashMap>();
        result.setData(new HashMap());
        result.getData().put("goodsList", goodsBiz.selectGoodsByCondition(new NideshopGoods(), 0, 0));
        return result;
    }

    @Override
    public Result<HashMap> skuAction(int goodsId) {
        return null;
    }

    private Map getSpecificationList(int goodsId){
        // 根据sku商品信息，查找规格值列表
        NideshopGoodsSpecification goodsSpecification = new NideshopGoodsSpecification();
        goodsSpecification.setGoodsId(goodsId);
        List<NideshopGoodsSpecification> specificationRes = goodsSpecificationService.selectGoodsByCondition(goodsSpecification,0,0);

        Map<String,Object> specificationList = new HashMap<>();
        Map<String,Object> hasSpecificationList = new HashMap<>();

        // 按规格名称分组
        for (int i = 0; i < specificationRes.size(); i++) {
            NideshopGoodsSpecification specItem = specificationRes.get(i);
            if (null!=hasSpecificationList.get(specItem.getSpecificationId())) {

                specificationList.put("specification_id",specItem.getSpecificationId());
                specificationList.put("name",specItem.getName());
                specificationList.put("valueList",specItem);
            }}
//                specificationList.push({
//                        specification_id: specItem.specification_id,
//                        name: specItem.name,
//                        valueList: [specItem]
//                });
//                hasSpecificationList[specItem.specification_id] = specItem;
//            } else {
//                for (let j = 0; j < specificationList.length; j++) {
//                    if (specificationList[j].specification_id === specItem.specification_id) {
//                        specificationList[j].valueList.push(specItem);
//                        break;
//                    }
//                }
//            }
//        }

//        const specificationList = [];
//        const hasSpecificationList = {};
//        // 按规格名称分组
//        for (let i = 0; i < specificationRes.length; i++) {
//            const specItem = specificationRes[i];
//            if (!hasSpecificationList[specItem.specification_id]) {
//                specificationList.push({
//                        specification_id: specItem.specification_id,
//                        name: specItem.name,
//                        valueList: [specItem]
//                });
//                hasSpecificationList[specItem.specification_id] = specItem;
//            } else {
//                for (let j = 0; j < specificationList.length; j++) {
//                    if (specificationList[j].specification_id === specItem.specification_id) {
//                        specificationList[j].valueList.push(specItem);
//                        break;
//                    }
//                }
//            }
//        }
//
//        return specificationList;

        return null;
    }
}

package com.hunhot.nideshop.service.impl;

import com.hunhot.nideshop.dto.Result;
import com.hunhot.nideshop.entity.NideshopBrand;
import com.hunhot.nideshop.entity.NideshopCategory;
import com.hunhot.nideshop.entity.NideshopGoods;
import com.hunhot.nideshop.entity.NideshopTopic;
import com.hunhot.nideshop.service.*;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class IndexContServiceImpl implements IndexContService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    // 注入Service依赖
    @Autowired
    private AdService adService;
    @Autowired
    private ChannelService channelService;
    @Autowired
    private GoodsService goodsService;
    @Autowired
    private BrandService brandService;
    @Autowired
    private TopicService topicService;
    @Autowired
    private CategoryService categoryService;

    @Override
    public Result<HashMap> getIndexData() {
        Result<HashMap> result = new Result<HashMap>();
        result.setData(new HashMap());

        result.getData().put("banner", adService.selectByAdPositionId((short) 1));
        result.getData().put("channel", channelService.selectAllChannels());

        NideshopGoods newGoods = new NideshopGoods();
        newGoods.setIsNew(1);
        result.getData().put("newGoodsList", goodsService.selectGoodsByCondition(newGoods, 1, 4));
        NideshopGoods hotGoods = new NideshopGoods();
        hotGoods.setIsHot(1);
        result.getData().put("hotGoodsList", goodsService.selectGoodsByCondition(hotGoods, 1, 3));
        NideshopBrand brand = new NideshopBrand();
        brand.setIsNew(1);
        result.getData().put("brandList", brandService.selectBrandsByCondition(brand, 1, 4));
        NideshopTopic topic = new NideshopTopic();
        result.getData().put("topicList", topicService.selectTopicsByCondition(topic, 1, 4));

        NideshopCategory category = new NideshopCategory();
        category.setParentId(0);
        category.setNameSign(" != ");
        category.setName("推荐");
        List<NideshopCategory> categoryList = categoryService.selectCategorysByCondition(category, 0, 0);

        Map<String,Object> newCategoryList = new HashMap<String,Object>();
        for (NideshopCategory categoryItem : categoryList) {
            NideshopCategory categoryTmp = new NideshopCategory();
            categoryTmp.setParentId(categoryItem.getId());
            List<Integer> childCategoryIds = categoryService.selectCategoryIdsByCondition(categoryTmp, 1, 100);

            newCategoryList.put("id",category.getId());
            newCategoryList.put("name",category.getName());
            if(CollectionUtils.isEmpty(childCategoryIds)){
                newCategoryList.put("goodsList",new ArrayList<NideshopGoods>());
                continue;
            }

            NideshopGoods goods = new NideshopGoods();
            goods.setCategoryIdList(childCategoryIds);
            List<NideshopGoods> categoryGoods = goodsService.selectGoodsByCondition(goods, 1, 7);
            newCategoryList.put("goodsList",categoryGoods);
        }
        result.getData().put("categoryList", newCategoryList);

        return result;
    }
}

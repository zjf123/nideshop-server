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
public class CatalogContServiceImpl implements CatalogContService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    // 注入Service依赖
    @Autowired
    private CategoryService categoryService;

    @Override
    public Result<HashMap> getIndexData(int categoryId) {
        Result<HashMap> result = new Result<HashMap>();
        result.setData(new HashMap());

        NideshopCategory category = new NideshopCategory();
        category.setParentId(0);
        List<NideshopCategory> data = categoryService.selectCategorysByCondition(category, 1, 10);

        NideshopCategory currentCategory = null;
        if (categoryId != 0) {
            currentCategory = categoryService.selectCategoryById(categoryId);
        }

        if (null == currentCategory && CollectionUtils.isNotEmpty(data)) {
            currentCategory = data.get(0);
        }

        // 获取子分类数据
        if (null!=currentCategory&&0!=currentCategory.getId()) {
            NideshopCategory categoryChild = new NideshopCategory();
            categoryChild.setParentId(currentCategory.getId());
            List<NideshopCategory> childs = categoryService.selectCategorysByCondition(categoryChild, 0, 0);
            currentCategory.setSubCategoryList(childs);
        }

        result.getData().put("categoryList",data);
        result.getData().put("currentCategory",currentCategory);

        return result;
    }

    @Override
    public Result<HashMap> currentAction(int categoryId) {
        Result<HashMap> result = new Result<HashMap>();
        result.setData(new HashMap());

        NideshopCategory currentCategory = null;
        if (categoryId != 0) {
            currentCategory = categoryService.selectCategoryById(categoryId);
        }

        // 获取子分类数据
        if (null!=currentCategory&&0!=currentCategory.getId()) {
            NideshopCategory categoryChild = new NideshopCategory();
            categoryChild.setParentId(currentCategory.getId());
            List<NideshopCategory> childs = categoryService.selectCategorysByCondition(categoryChild, 0, 0);
            currentCategory.setSubCategoryList(childs);
        }

        result.getData().put("currentCategory",currentCategory);

        return result;
    }
}

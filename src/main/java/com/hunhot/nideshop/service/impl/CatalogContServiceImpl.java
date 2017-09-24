package com.hunhot.nideshop.service.impl;

import com.hunhot.nideshop.biz.CategoryBiz;
import com.hunhot.nideshop.utils.Result;
import com.hunhot.nideshop.entity.NideshopCategory;
import com.hunhot.nideshop.service.CatalogContService;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class CatalogContServiceImpl implements CatalogContService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    // 注入Service依赖
    @Autowired
    private CategoryBiz categoryBiz;

    @Override
    public Result<HashMap> getIndexData(int categoryId) {
        Result<HashMap> result = new Result<HashMap>();
        result.setData(new HashMap());

        NideshopCategory category = new NideshopCategory();
        category.setParentId(0);
        List<NideshopCategory> data = categoryBiz.selectCategorysByCondition(category, 1, 10);

        NideshopCategory currentCategory = null;
        if (categoryId != 0) {
            currentCategory = categoryBiz.selectCategoryById(categoryId);
        }

        if (null == currentCategory && CollectionUtils.isNotEmpty(data)) {
            currentCategory = data.get(0);
        }

        // 获取子分类数据
        if (null!=currentCategory&&0!=currentCategory.getId()) {
            NideshopCategory categoryChild = new NideshopCategory();
            categoryChild.setParentId(currentCategory.getId());
            List<NideshopCategory> childs = categoryBiz.selectCategorysByCondition(categoryChild, 0, 0);
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
            currentCategory = categoryBiz.selectCategoryById(categoryId);
        }

        // 获取子分类数据
        if (null!=currentCategory&&0!=currentCategory.getId()) {
            NideshopCategory categoryChild = new NideshopCategory();
            categoryChild.setParentId(currentCategory.getId());
            List<NideshopCategory> childs = categoryBiz.selectCategorysByCondition(categoryChild, 0, 0);
            currentCategory.setSubCategoryList(childs);
        }

        result.getData().put("currentCategory",currentCategory);

        return result;
    }
}

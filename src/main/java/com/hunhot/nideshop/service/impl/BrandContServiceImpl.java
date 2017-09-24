package com.hunhot.nideshop.service.impl;

import com.hunhot.nideshop.biz.BrandBiz;
import com.hunhot.nideshop.utils.Result;
import com.hunhot.nideshop.entity.NideshopBrand;
import com.hunhot.nideshop.service.BrandContService;
import com.hunhot.nideshop.utils.PageCountUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class BrandContServiceImpl implements BrandContService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    // 注入Service依赖
    @Autowired
    private BrandBiz brandService;

    @Override
    public Result<HashMap> getListData(int page, int size) {
        Result<HashMap> result = new Result<HashMap>();
        result.setData(new HashMap());

        NideshopBrand brand = new NideshopBrand();
        result.getData().put("brandList", brandService.selectBrandsByCondition(brand, PageCountUtils.getPageFrom(page,size), PageCountUtils.getPageTo(page,size)));

        return result;
    }

    @Override
    public Result<HashMap> getDetailData(int id) {
        Result<HashMap> result = new Result<HashMap>();
        result.setData(new HashMap());
        NideshopBrand brand = brandService.selectBrandById(id);
        result.getData().put("brand",brand);
        return result;
    }


}

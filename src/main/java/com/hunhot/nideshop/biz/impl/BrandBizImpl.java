package com.hunhot.nideshop.biz.impl;

import com.hunhot.nideshop.dao.NideshopBrandMapper;
import com.hunhot.nideshop.entity.NideshopBrand;
import com.hunhot.nideshop.biz.BrandBiz;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandBizImpl implements BrandBiz {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// 注入Service依赖
	@Autowired
	private NideshopBrandMapper nideshopBrandMapper;

	@Override
	public List<NideshopBrand> selectBrandsByCondition(NideshopBrand brand, int offset, int limit) {
		brand.setOffset(offset);
		brand.setLimit(limit);
		return nideshopBrandMapper.selectBrandsByCondition(brand);
	}

	public NideshopBrand selectBrandById(int id){
		return nideshopBrandMapper.selectByPrimaryKey(id);
	}
}

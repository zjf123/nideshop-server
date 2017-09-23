package com.hunhot.nideshop.biz.impl;

import com.hunhot.nideshop.dao.NideshopCategoryMapper;
import com.hunhot.nideshop.entity.NideshopCategory;
import com.hunhot.nideshop.biz.CategoryBiz;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryBizImpl implements CategoryBiz {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// 注入Service依赖
	@Autowired
	private NideshopCategoryMapper nideshopCategoryMapper;

	@Override
	public List<NideshopCategory> selectCategorysByCondition(NideshopCategory category, int offset, int limit) {
		category.setOffset(offset);
		category.setLimit(limit);
		return nideshopCategoryMapper.selectCategorysByCondition(category);
	}

	public List<Integer> selectCategoryIdsByCondition(NideshopCategory category, int offset, int limit){
		category.setOffset(offset);
		category.setLimit(limit);
		return nideshopCategoryMapper.selectCategoryIdsByCondition(category);
	}

	public NideshopCategory selectCategoryById(int categoryId){
		return nideshopCategoryMapper.selectByPrimaryKey(categoryId);
	}
}

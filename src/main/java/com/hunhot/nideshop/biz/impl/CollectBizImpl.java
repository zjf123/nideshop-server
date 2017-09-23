package com.hunhot.nideshop.biz.impl;

import com.hunhot.nideshop.biz.CollectBiz;
import com.hunhot.nideshop.dao.NideshopCollectMapper;
import com.hunhot.nideshop.entity.NideshopCollect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollectBizImpl implements CollectBiz {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// 注入Service依赖
	@Autowired
	private NideshopCollectMapper nideshopCollectMapper;

	@Override
	public List<NideshopCollect> selectCollectsByCondition(NideshopCollect collect, int offset, int limit) {
		collect.setOffset(offset);
		collect.setLimit(limit);
		return nideshopCollectMapper.selectCollectsByCondition(collect);
	}
	@Override
	public List<NideshopCollect> selectCollectsRelationGoodsByCondition(NideshopCollect collect, int offset, int limit) {
		collect.setOffset(offset);
		collect.setLimit(limit);
		return nideshopCollectMapper.selectCollectsRelationGoodsByCondition(collect);
	}

	public NideshopCollect selectCollectById(int id){
		return nideshopCollectMapper.selectByPrimaryKey(id);
	}
}

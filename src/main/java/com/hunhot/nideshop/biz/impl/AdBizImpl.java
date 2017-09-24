package com.hunhot.nideshop.biz.impl;

import com.hunhot.nideshop.dao.NideshopAdMapper;
import com.hunhot.nideshop.entity.NideshopAd;
import com.hunhot.nideshop.biz.AdBiz;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdBizImpl implements AdBiz {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// 注入Service依赖
	@Autowired
	private NideshopAdMapper nideshopAdMapper;

	@Override
	public List<NideshopAd> selectByAdPositionId(Short adPositionId) {
		return nideshopAdMapper.selectByAdPositionId(adPositionId);
	}
}

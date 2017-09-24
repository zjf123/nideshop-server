package com.hunhot.nideshop.biz.impl;

import com.hunhot.nideshop.dao.NideshopTopicMapper;
import com.hunhot.nideshop.entity.NideshopTopic;
import com.hunhot.nideshop.biz.TopicBiz;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicBizImpl implements TopicBiz {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// 注入Service依赖
	@Autowired
	private NideshopTopicMapper nideshopTopicMapper;

	@Override
	public List<NideshopTopic> selectTopicsByCondition(NideshopTopic topic, int offset, int limit) {
		topic.setOffset(offset);
		topic.setLimit(limit);
		return nideshopTopicMapper.selectTopicsByCondition(topic);
	}
}

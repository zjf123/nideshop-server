package com.hunhot.nideshop.service.impl;

import com.hunhot.nideshop.dao.NideshopChannelMapper;
import com.hunhot.nideshop.entity.NideshopChannel;
import com.hunhot.nideshop.service.ChannelService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChannelServiceImpl implements ChannelService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// 注入Service依赖
	@Autowired
	private NideshopChannelMapper nideshopChannelMapper;

	@Override
	public List<NideshopChannel> selectAllChannels() {
		return nideshopChannelMapper.selectAllChannels();
	}
}

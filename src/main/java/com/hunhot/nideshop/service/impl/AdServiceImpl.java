package com.hunhot.nideshop.service.impl;

import com.hunhot.nideshop.dao.AppointmentDao;
import com.hunhot.nideshop.dao.BookDao;
import com.hunhot.nideshop.dao.NideshopAdMapper;
import com.hunhot.nideshop.dto.AppointExecution;
import com.hunhot.nideshop.entity.Appointment;
import com.hunhot.nideshop.entity.Book;
import com.hunhot.nideshop.entity.NideshopAd;
import com.hunhot.nideshop.enums.AppointStateEnum;
import com.hunhot.nideshop.exception.AppointException;
import com.hunhot.nideshop.exception.NoNumberException;
import com.hunhot.nideshop.exception.RepeatAppointException;
import com.hunhot.nideshop.service.AdService;
import com.hunhot.nideshop.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AdServiceImpl implements AdService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// 注入Service依赖
	@Autowired
	private NideshopAdMapper nideshopAdMapper;

	@Override
	public NideshopAd selectByAdPositionId(Short adPositionId) {
		return nideshopAdMapper.selectByAdPositionId(adPositionId);
	}
}

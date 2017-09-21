package com.hunhot.nideshop.web;

import com.hunhot.nideshop.dto.Result;
import com.hunhot.nideshop.service.IndexContService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;

@Controller
@RequestMapping("/index") // url:/模块/资源/{id}/细分 /seckill/list
public class IndexController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private IndexContService indexContService;

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public HashMap list(Model model) {
		Result<HashMap> result = indexContService.getIndexData();
		return result.getData();
	}



}

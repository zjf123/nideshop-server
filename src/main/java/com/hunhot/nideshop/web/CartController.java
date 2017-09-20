package com.hunhot.nideshop.web;

import com.hunhot.nideshop.dto.AppointExecution;
import com.hunhot.nideshop.dto.Result;
import com.hunhot.nideshop.entity.Book;
import com.hunhot.nideshop.enums.AppointStateEnum;
import com.hunhot.nideshop.exception.NoNumberException;
import com.hunhot.nideshop.exception.RepeatAppointException;
import com.hunhot.nideshop.service.BookService;
import com.hunhot.nideshop.service.CartContService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/cart") // url:/模块/资源/{id}/细分 /seckill/list
public class CartController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private CartContService cartContService;

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	private HashMap index(Model model) {
		Result<HashMap> result = cartContService.getIndexData();
		return result.getData();
	}


}

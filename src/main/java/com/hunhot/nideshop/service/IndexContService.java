package com.hunhot.nideshop.service;

import com.hunhot.nideshop.dto.Result;

import java.util.HashMap;

/**
 * 业务接口：站在"使用者"角度设计接口 三个方面：方法定义粒度，参数，返回类型（return 类型/异常）
 */
public interface IndexContService {

	/**
	 * 返回index数据
	 * @return
	 */
	Result<HashMap> getIndexData();


}

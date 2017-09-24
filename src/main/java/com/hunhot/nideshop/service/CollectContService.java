package com.hunhot.nideshop.service;

import com.hunhot.nideshop.utils.Result;

import java.util.HashMap;

/**
 * 业务接口：站在"使用者"角度设计接口 三个方面：方法定义粒度，参数，返回类型（return 类型/异常）
 */
public interface CollectContService {

	/**
	 * 返回list数据
	 * @return
	 * @param typeId
	 */
	Result<HashMap> getListData(int typeId);

	Result<HashMap> getAddordeleteData(int typeId, int valueId);
}

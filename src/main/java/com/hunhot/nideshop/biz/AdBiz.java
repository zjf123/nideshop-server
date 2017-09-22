package com.hunhot.nideshop.biz;

import com.hunhot.nideshop.entity.NideshopAd;

import java.util.List;

/**
 * 业务接口：站在"使用者"角度设计接口 三个方面：方法定义粒度，参数，返回类型（return 类型/异常）
 */
public interface AdBiz {

	/**
	 * 查询一本图书
	 * 
	 * @param adPositionId
	 * @return
	 */
	List<NideshopAd> selectByAdPositionId(Short adPositionId);


}

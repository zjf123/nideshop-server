package com.hunhot.nideshop.web;

import com.hunhot.nideshop.dto.AppointExecution;
import com.hunhot.nideshop.dto.Result;
import com.hunhot.nideshop.entity.Book;
import com.hunhot.nideshop.enums.AppointStateEnum;
import com.hunhot.nideshop.exception.NoNumberException;
import com.hunhot.nideshop.exception.RepeatAppointException;
import com.hunhot.nideshop.service.BookService;
import com.hunhot.nideshop.service.IndexContService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/index") // url:/模块/资源/{id}/细分 /seckill/list
public class IndexController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private IndexContService indexContService;

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	private ModelAndView list(Model model) {

//	  const banner = await this.model('ad').where({ad_position_id: 1}).select();
//    const channel = await this.model('channel').order({sort_order: 'asc'}).select();
//    const newGoods = await this.model('goods').field(['id', 'name', 'list_pic_url', 'retail_price']).where({is_new: 1}).limit(4).select();
//    const hotGoods = await this.model('goods').field(['id', 'name', 'list_pic_url', 'retail_price', 'goods_brief']).where({is_hot: 1}).limit(3).select();
//    const brandList = await this.model('brand').where({is_new: 1}).order({new_sort_order: 'asc'}).limit(4).select();
//    const topicList = await this.model('topic').limit(3).select();
//
//    const categoryList = await this.model('category').where({parent_id: 0, name: ['<>', '推荐']}).select();
//    const newCategoryList = [];
//		for (const categoryItem of categoryList) {
//      const childCategoryIds = await this.model('category').where({parent_id: categoryItem.id}).getField('id', 100);
//      const categoryGoods = await this.model('goods').field(['id', 'name', 'list_pic_url', 'retail_price']).where({category_id: ['IN', childCategoryIds]}).limit(7).select();
//			newCategoryList.push({
//					id: categoryItem.id,
//					name: categoryItem.name,
//					goodsList: categoryGoods
//      });
//		}
//
//		return this.success({
//				banner: banner,
//				channel: channel,
//				newGoodsList: newGoods,
//				hotGoodsList: hotGoods,
//				brandList: brandList,
//				topicList: topicList,
//				categoryList: newCategoryList
//    });
		ModelAndView mav = indexContService.getIndexData();
		return mav;
	}



}

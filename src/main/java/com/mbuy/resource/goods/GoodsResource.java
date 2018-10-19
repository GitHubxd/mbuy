package com.mbuy.resource.goods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mbuy.model.GoodsVo;
import com.mbuy.service.goods.GoodsService;
import com.mbuy.utils.CommonResponse;

/**
 * 
 * @author 37523
 *
 */
@RestController
@RequestMapping("mbuy/goods")
public class GoodsResource implements IGoodsResource {

	@Autowired
	private GoodsService goodsService;

	@Override
	@RequestMapping(value = "/getAllGoods", method = RequestMethod.POST)
	public CommonResponse getAllGoods() {
		CommonResponse commonResponse = goodsService.getAllGoods();
		return commonResponse;
	}

	@Override
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public CommonResponse addGoods(@RequestBody GoodsVo goodsVo) {
		return goodsService.addGoods(goodsVo);
	}

}

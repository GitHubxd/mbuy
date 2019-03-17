package com.mbuy.resource.aliorder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mbuy.entitys.AliGoods;
import com.mbuy.service.aligoods.AliGoodsService;
import com.mbuy.utils.CommonResponse;

@RestController
@RequestMapping("/mbuy/aligoods")
public class AliGoodsResource {
	
	@Autowired
	private AliGoodsService goodsService;

	@RequestMapping(value="/add", method=RequestMethod.POST)
	public CommonResponse addGoods(@RequestBody AliGoods goods) {
		return goodsService.addGoods(goods);
	}
	
	@RequestMapping(value="getAll", method=RequestMethod.POST)
	public CommonResponse getAll() {
		return goodsService.getAll();
	}
}

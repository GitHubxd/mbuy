package com.mbuy.resource.aliorder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mbuy.entitys.AliOrder;
import com.mbuy.model.AliOrderVo;
import com.mbuy.service.aliorder.AliOrderService;
import com.mbuy.utils.CommonResponse;

/**
 * 
 * @author 37523
 *
 */

@RestController
@RequestMapping("mbuy/aliorder")
public class AliOrderResource {
	
	@Autowired
	AliOrderService orderService;
	
	@RequestMapping(value="getAll", method = RequestMethod.POST)
	public CommonResponse getAll(@RequestBody AliOrderVo orderVo) {
		return orderService.getAll(orderVo);
	}

	@RequestMapping(value="getById", method = RequestMethod.POST)
	public CommonResponse getById(@RequestBody AliOrder order) {
		return orderService.getById(order.getId());
	}
	
	@RequestMapping(value="updateById", method = RequestMethod.POST)
	public CommonResponse updateById(@RequestBody AliOrder order) {
		return orderService.updateById(order);
	}
	
	@RequestMapping(value="addOrder", method = RequestMethod.POST)
	public CommonResponse addOrder(@RequestBody AliOrder order) {
		return orderService.addOrder(order);
	}
	
	@RequestMapping(value="delOrder", method = RequestMethod.POST)
	public CommonResponse delOrder(@RequestBody AliOrderVo orderVo) {
		return orderService.delOrder(orderVo);
	}
}

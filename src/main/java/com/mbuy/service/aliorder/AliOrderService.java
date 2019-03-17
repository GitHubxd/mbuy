package com.mbuy.service.aliorder;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.mbuy.entitys.AliOrder;
import com.mbuy.entitys.AliOrderExample;
import com.mbuy.entitys.AliOrderExample.Criteria;
import com.mbuy.mapper.AliOrderMapper;
import com.mbuy.model.AliOrderVo;
import com.mbuy.utils.CommonResponse;

@Service
public class AliOrderService {

	@Autowired
	AliOrderMapper orderMapper;
	
	public CommonResponse getAll(AliOrderVo orderVo) {
		CommonResponse res = CommonResponse.getInstance();
		AliOrderExample aoe = new AliOrderExample();
		aoe.setLimitStart(orderVo.getStartRow());
		aoe.setPageSize(orderVo.getRowCount());
		aoe.setOrderByClause("add_time desc");
		Criteria cr = aoe.createCriteria();
		if(!StringUtils.isEmpty(orderVo.getAliWangwang())) {			
			cr.andAliWangwangLike("%"+orderVo.getAliWangwang()+"%");
		}
		if(!StringUtils.isEmpty(orderVo.getReceiveName())) {
			cr.andReceiveNameLike("%"+orderVo.getReceiveName()+"%");
		}
		if(!StringUtils.isEmpty(orderVo.getExecState())) {
			cr.andExecStateEqualTo(orderVo.getExecState());
		}
		if(orderVo.getAddTime() != null) {
			long times = (long)orderVo.getAddTime() * 1000;
			String str1 = dateToStr(times);
			Date startDate = strToDate(str1+" 00:00:00");
			Date endDate = strToDate(str1+" 23:59:59");
			cr.andAddTimeBetween((int)(startDate.getTime()/1000), (int)(endDate.getTime()/1000));
		}
		List<AliOrder> result = orderMapper.selectByExample(aoe);
		int totalCount = orderMapper.countByExample(aoe);
		res.setResult(result);
		res.setTotalNum(totalCount);
		return res;
	}
	
	public CommonResponse getById(int id) {
		CommonResponse res = CommonResponse.getInstance();
		AliOrder ao = orderMapper.selectByPrimaryKey(id);
		res.setResult(ao);
		return res;
	}
	
	public CommonResponse updateById(AliOrder order) {
		CommonResponse res = CommonResponse.getInstance();
		order.setUpdateTime((int) (System.currentTimeMillis()/1000));
		orderMapper.updateByPrimaryKey(order);
		return res;
	}
	
	public CommonResponse addOrder(AliOrder order) {
		CommonResponse res = CommonResponse.getInstance();
		order.setAddTime((int) (System.currentTimeMillis()/1000));
		orderMapper.insert(order);
		return res;
	}
	
	public CommonResponse delOrder(AliOrderVo orderVo) {
		CommonResponse res = CommonResponse.getInstance();
		AliOrderExample example = new AliOrderExample();
		Criteria cra = example.createCriteria();
		cra.andIdIn(orderVo.getIds());
		orderMapper.deleteByExample(example);
		return res;
	}
	
	private Date strToDate(String strDate) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        ParsePosition pos = new ParsePosition(0);
        Date strtodate = formatter.parse(strDate, pos);
        return strtodate;
    }
	
	private String dateToStr(long times) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        return formatter.format(new Date(times));
	}
}

package com.mbuy.mapper;

import com.mbuy.entitys.AliGoods;
import com.mbuy.entitys.AliGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AliGoodsMapper {
    int countByExample(AliGoodsExample example);

    int deleteByExample(AliGoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AliGoods record);

    int insertSelective(AliGoods record);

    List<AliGoods> selectByExample(AliGoodsExample example);

    AliGoods selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AliGoods record, @Param("example") AliGoodsExample example);

    int updateByExample(@Param("record") AliGoods record, @Param("example") AliGoodsExample example);

    int updateByPrimaryKeySelective(AliGoods record);

    int updateByPrimaryKey(AliGoods record);
}
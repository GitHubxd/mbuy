package com.mbuy.mapper;

import com.mbuy.entitys.AliOrder;
import com.mbuy.entitys.AliOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AliOrderMapper {
    int countByExample(AliOrderExample example);

    int deleteByExample(AliOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AliOrder record);

    int insertSelective(AliOrder record);

    List<AliOrder> selectByExample(AliOrderExample example);

    AliOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AliOrder record, @Param("example") AliOrderExample example);

    int updateByExample(@Param("record") AliOrder record, @Param("example") AliOrderExample example);

    int updateByPrimaryKeySelective(AliOrder record);

    int updateByPrimaryKey(AliOrder record);
}
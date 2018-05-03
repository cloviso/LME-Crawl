package com.maikegroup.delight.data.repository.data.cuPrice.dao;

import com.maikegroup.delight.data.repository.data.cuPrice.model.CuPrice;
import com.maikegroup.delight.data.repository.data.cuPrice.model.CuPriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CuPriceMapper {
    long countByExample(CuPriceExample example);

    int deleteByExample(CuPriceExample example);

    int deleteByPrimaryKey(String tId);

    int insert(CuPrice record);

    int insertSelective(CuPrice record);

    List<CuPrice> selectByExample(CuPriceExample example);

    CuPrice selectByPrimaryKey(String tId);

    int updateByExampleSelective(@Param("record") CuPrice record, @Param("example") CuPriceExample example);

    int updateByExample(@Param("record") CuPrice record, @Param("example") CuPriceExample example);

    int updateByPrimaryKeySelective(CuPrice record);

    int updateByPrimaryKey(CuPrice record);
}
package com.maikegroup.delight.data.repository.data.lmeprice.dao;

import com.maikegroup.delight.data.repository.data.lmeprice.model.LmePrice;
import com.maikegroup.delight.data.repository.data.lmeprice.model.LmePriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LmePriceMapper {
    long countByExample(LmePriceExample example);

    int deleteByExample(LmePriceExample example);

    int deleteByPrimaryKey(Integer key);

    int insert(LmePrice record);

    int insertSelective(LmePrice record);

    List<LmePrice> selectByExample(LmePriceExample example);

    LmePrice selectByPrimaryKey(Integer key);

    int updateByExampleSelective(@Param("record") LmePrice record, @Param("example") LmePriceExample example);

    int updateByExample(@Param("record") LmePrice record, @Param("example") LmePriceExample example);

    int updateByPrimaryKeySelective(LmePrice record);

    int updateByPrimaryKey(LmePrice record);
}
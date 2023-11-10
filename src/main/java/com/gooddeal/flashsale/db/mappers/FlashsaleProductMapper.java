package com.gooddeal.flashsale.db.mappers;

import com.gooddeal.flashsale.db.po.FlashsaleProduct;

public interface FlashsaleProductMapper {
    int deleteByPrimaryKey(Long id);

    int insert(FlashsaleProduct record);

    int insertSelective(FlashsaleProduct record);

    FlashsaleProduct selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FlashsaleProduct record);

    int updateByPrimaryKey(FlashsaleProduct record);
}
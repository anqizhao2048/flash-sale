package com.gooddeal.flashsale.db.mappers;

import com.gooddeal.flashsale.db.po.FlashsaleEvent;

import java.util.List;

public interface FlashsaleEventMapper {
    int deleteByPrimaryKey(Long id);

    int insert(FlashsaleEvent record);

    int insertSelective(FlashsaleEvent record);

    FlashsaleEvent selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FlashsaleEvent record);

    int updateByPrimaryKey(FlashsaleEvent record);

    List<FlashsaleEvent> queryFlashsaleEventsByStatus(int status);
}
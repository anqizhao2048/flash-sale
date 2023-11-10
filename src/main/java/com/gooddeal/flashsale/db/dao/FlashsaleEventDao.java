package com.gooddeal.flashsale.db.dao;

import com.gooddeal.flashsale.db.po.FlashsaleEvent;

import java.util.List;

public interface FlashsaleEventDao {

    public List<FlashsaleEvent> queryFlashsaleEventsByStatus(int status);

    public void inertFlashsaleEvent(FlashsaleEvent flashsaleEvent);

    public FlashsaleEvent queryFlashsaleEventById(long id);

    public void updateFlashsaleEvent(FlashsaleEvent flashsaleEvent);
}

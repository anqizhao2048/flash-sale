package com.gooddeal.flashsale.db.dao;

import com.gooddeal.flashsale.db.mappers.FlashsaleEventMapper;
import com.gooddeal.flashsale.db.po.FlashsaleEvent;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class FlashsaleEventDaoImpl implements FlashsaleEventDao {

    @Resource
    private FlashsaleEventMapper flashsaleEventMapper;

    @Override
    public List<FlashsaleEvent> queryFlashsaleEventsByStatus(int status) {
        return flashsaleEventMapper.queryFlashsaleEventsByStatus(status);
    }

    @Override
    public void inertFlashsaleEvent(FlashsaleEvent seckillActivity) {
        flashsaleEventMapper.insert(seckillActivity);
    }

    @Override
    public FlashsaleEvent queryFlashsaleEventById(long id) {
        return flashsaleEventMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateFlashsaleEvent(FlashsaleEvent flashsaleEvent) {
        flashsaleEventMapper.updateByPrimaryKey(flashsaleEvent);
    }
}

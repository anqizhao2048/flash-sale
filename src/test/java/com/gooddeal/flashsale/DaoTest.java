package com.gooddeal.flashsale;

import com.gooddeal.flashsale.db.dao.FlashsaleEventDao;
import com.gooddeal.flashsale.db.mappers.FlashsaleEventMapper;
import com.gooddeal.flashsale.db.po.FlashsaleEvent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
public class DaoTest {
    @Resource
    private FlashsaleEventMapper flashsaleEventMapper;
    @Autowired
    private FlashsaleEventDao flashsaleEventDao;

    @Test
    void flashsaleEventTest() {
        FlashsaleEvent flashsaleEvent = new FlashsaleEvent();
        flashsaleEvent.setName("this is a new event lol");
        flashsaleEvent.setProductId(999L);
        flashsaleEvent.setInventory(100L);
        flashsaleEvent.setFlashSalePrice(new BigDecimal(99));
        flashsaleEvent.setStatus(1);
        flashsaleEvent.setOriginalPrice(new BigDecimal(199));
        flashsaleEvent.setAvailableInventory(100);
        flashsaleEvent.setLockInventory(0L);
        flashsaleEventMapper.insert(flashsaleEvent);
        System.out.println("====>>>>" + flashsaleEventMapper.selectByPrimaryKey(1L).getName());
    }

    @Test
    void setFlashsaleEventQuery() {
        List<FlashsaleEvent> flashsaleEvents = flashsaleEventDao.queryFlashsaleEventsByStatus(0);
        System.out.println(flashsaleEvents.size());
        flashsaleEvents.stream().forEach(flashsaleEvent -> System.out.println(flashsaleEvent.getName()));
    }
}
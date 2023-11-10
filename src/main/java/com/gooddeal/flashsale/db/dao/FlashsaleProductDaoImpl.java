package com.gooddeal.flashsale.db.dao;

import com.gooddeal.flashsale.db.mappers.FlashsaleProductMapper;
import com.gooddeal.flashsale.db.po.FlashsaleProduct;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class FlashsaleProductDaoImpl implements FlashsaleProductDao {

    @Resource
    private FlashsaleProductMapper flashsaleProductMapper;

    @Override
    public FlashsaleProduct queryFlashsaleProductById(long id) {
        return flashsaleProductMapper.selectByPrimaryKey(id);
    }
}

package com.gooddeal.flashsale.db.dao;

import com.gooddeal.flashsale.db.po.FlashsaleProduct;

public interface FlashsaleProductDao {

    public FlashsaleProduct queryFlashsaleProductById(long id);
}

package com.gooddeal.flashsale.db.po;

import java.math.BigDecimal;
import java.util.Date;

public class FlashsaleEvent {
    private Long id;

    private String name;

    private Long productId;

    private BigDecimal originalPrice;

    private BigDecimal flashSalePrice;

    private Integer status;

    private Date startTime;

    private Date endTime;

    private Long inventory;

    private Integer availableInventory;

    private Long lockInventory;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    public BigDecimal getFlashSalePrice() {
        return flashSalePrice;
    }

    public void setFlashSalePrice(BigDecimal flashSalePrice) {
        this.flashSalePrice = flashSalePrice;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Long getInventory() {
        return inventory;
    }

    public void setInventory(Long inventory) {
        this.inventory = inventory;
    }

    public Integer getAvailableInventory() {
        return availableInventory;
    }

    public void setAvailableInventory(Integer availableInventory) {
        this.availableInventory = availableInventory;
    }

    public Long getLockInventory() {
        return lockInventory;
    }

    public void setLockInventory(Long lockInventory) {
        this.lockInventory = lockInventory;
    }
}
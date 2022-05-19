package com.atguigu.springcloud.alibaba.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class Order implements Serializable {

    private Long id;
    private Long userId;
    private Long productId;
    private Integer count;
    private BigDecimal money;

    // 订单状态：0：创建中； 1：已完结
    private Integer status;

    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getProductId() {
        return productId;
    }

    public Integer getCount() {
        return count;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public Integer getStatus() {
        return status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}

package com.atguigu.springcloud.alibaba.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class Account implements Serializable {
    private Long id;
    private Long userId;
    private BigDecimal total;
    private BigDecimal used;
    private BigDecimal residue;

    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public BigDecimal getUsed() {
        return used;
    }

    public BigDecimal getResidue() {
        return residue;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public void setUsed(BigDecimal used) {
        this.used = used;
    }

    public void setResidue(BigDecimal residue) {
        this.residue = residue;
    }
}

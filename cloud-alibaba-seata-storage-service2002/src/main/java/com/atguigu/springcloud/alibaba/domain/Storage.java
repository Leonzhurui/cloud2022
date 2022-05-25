package com.atguigu.springcloud.alibaba.domain;

import java.io.Serializable;

public class Storage implements Serializable {

    private Long id;
    private Long productId;
    private Integer total;
    private Integer used;
    private Integer residue;

    public Long getId() {
        return id;
    }

    public Long getProductId() {
        return productId;
    }

    public Integer getTotal() {
        return total;
    }

    public Integer getUsed() {
        return used;
    }

    public Integer getResidue() {
        return residue;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }

    public void setResidue(Integer residue) {
        this.residue = residue;
    }
}

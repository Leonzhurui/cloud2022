package com.atguigu.springcloud.alibaba.service;

import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

public interface AccountService {

    /**
     * 扣减账户余额
     *
     * @param userId
     * @param money
     */
    void decrease(Long userId, BigDecimal money);
}

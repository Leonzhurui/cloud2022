package com.atguigu.springcloud.alibaba.service.impl;

import com.atguigu.springcloud.alibaba.dao.StorageDao;
import com.atguigu.springcloud.alibaba.service.StorageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageDao storageDao;

    /**
     * 扣减库存
     *
     * @param productId
     * @param count
     */
    @Override
    public void decrease(Long productId, Integer count) {
        System.out.println("-------->开始扣减库存");

        storageDao.decrease(productId, count);

        System.out.println("-------->开始扣减库存end");
    }
}

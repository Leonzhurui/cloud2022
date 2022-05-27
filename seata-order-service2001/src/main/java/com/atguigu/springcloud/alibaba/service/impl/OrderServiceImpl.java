package com.atguigu.springcloud.alibaba.service.impl;

import com.atguigu.springcloud.alibaba.dao.OrderDao;
import com.atguigu.springcloud.alibaba.domain.Order;
import com.atguigu.springcloud.alibaba.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;

    @Override
    public void create(Order order) {
        // 1.新建订单
        System.out.println("------>开始新建订单");
        orderDao.create(order);

        // 4.修改订单状态，从0到1，1代表已经完成
        System.out.println("------>修改订单状态开始");
        orderDao.update(order.getUserId(), 0);
        System.out.println("------>修改订单状态结束");

        System.out.println("------>下订单结束~~");
    }
}

package com.jiuzhang.seckill8jdk.db.dao;

import com.jiuzhang.seckill8jdk.db.mappers.OrderMapper;
import com.jiuzhang.seckill8jdk.db.po.Order;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class OrderDaolmpl implements OrderDao {

    @Resource
    private OrderMapper orderMapper;

    @Override
    public void insertOrder(Order order) {
        orderMapper.insert(order);
    }

    @Override
    public Order queryOrder(String orderNo) {
        return orderMapper.selectByOrderNo(orderNo);
    }

    @Override
    public void updateOrder(Order order) {
        orderMapper.updateByPrimaryKey(order);
    }

}

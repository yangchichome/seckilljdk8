package com.jiuzhang.seckill8jdk.db.dao;

import com.jiuzhang.seckill8jdk.db.po.Order;

public interface OrderDao {

    public void insertOrder(Order order);

    public Order queryOrder(String orderNo);

    public void updateOrder(Order order);
}

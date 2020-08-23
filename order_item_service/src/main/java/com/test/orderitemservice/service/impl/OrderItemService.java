package com.test.orderitemservice.service.impl;

import com.test.orderitemservice.dao.OrderItemDao;
import com.test.orderitemservice.model.OrderItemModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class OrderItemService implements com.test.orderitemservice.service.OrderItemService {

    @Autowired
    private OrderItemDao orderItemDao;

    @Transactional
    @Override
    public boolean createOrderItems(Long orderId, List<OrderItemModel> orderItems) {
        orderItems.forEach(orderItemModel -> orderItemModel.setOrderId(orderId));
        orderItemDao.saveAll(orderItems);
        return true;
    }

    @Transactional
    @Override
    public List<OrderItemModel> getOrderItems(Long orderId) {
        return orderItemDao.findByOrderId(orderId);
    }
}

package com.test.orderitemservice.service;

import com.test.orderitemservice.model.OrderItemModel;

import java.util.List;

public interface OrderItemService {
    boolean createOrderItems(Long orderId, List<OrderItemModel> orderItems);
    List<OrderItemModel> getOrderItems(Long orderId);
}

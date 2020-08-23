package com.test.orderitemservice.dao;

import com.test.orderitemservice.model.OrderItemModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderItemDao  extends JpaRepository<OrderItemModel, Long> {

    List<OrderItemModel> findByOrderId(Long orderId);
}

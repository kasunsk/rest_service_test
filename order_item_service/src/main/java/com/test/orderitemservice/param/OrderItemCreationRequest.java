package com.test.orderitemservice.param;

import com.test.orderitemservice.model.OrderItemModel;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter@Setter
public class OrderItemCreationRequest {
    private Long orderId;
    private List<OrderItemModel> orderItemModelList;
}

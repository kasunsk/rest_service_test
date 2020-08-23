package com.test.orderitemservice.controller;

import com.test.orderitemservice.model.OrderItemModel;
import com.test.orderitemservice.param.OrderItemCreationRequest;
import com.test.orderitemservice.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orderitem")
public class OrderItemController {

    @Autowired
    private OrderItemService orderItemService;

    @RequestMapping(value = "/{orderId}", method = RequestMethod.GET)
    public List<OrderItemModel> retrieveOrderItem(@PathVariable("orderId") Long orderId) {
        return orderItemService.getOrderItems(orderId);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Boolean createOrderItem(@RequestBody OrderItemCreationRequest request) {
        if (request != null) {
            orderItemService.createOrderItems(request.getOrderId(), request.getOrderItemModelList());
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }

}

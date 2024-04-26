package com.ryan.springbootmall.service;

import com.ryan.springbootmall.dto.CreateOrderRequest;
import com.ryan.springbootmall.dto.OrderQueryParams;
import com.ryan.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

}

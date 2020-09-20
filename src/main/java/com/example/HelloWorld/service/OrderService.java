package com.example.HelloWorld.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.example.HelloWorld.model.Order;

public interface OrderService {
    boolean saveOrder(Order order) throws JsonProcessingException;

    Order getOrderDetails(String id);

    boolean deleteOrder(String id);

    boolean updateOrder(Order order);
}

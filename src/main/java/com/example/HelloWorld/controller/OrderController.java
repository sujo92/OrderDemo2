package com.example.HelloWorld.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.example.HelloWorld.model.Order;
import com.example.HelloWorld.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/app")
public class OrderController {

    @Autowired
    private OrderService orderService;


    @PostMapping("/order")
    public boolean createOrder(@RequestBody Order order) throws JsonProcessingException {
        orderService.saveOrder(order);
        return true;
    }

    @GetMapping("/order/{id}")
    public Order getOrder(@PathVariable String id){
        return orderService.getOrderDetails(id);
    }

    @DeleteMapping("/order/{id}")
    public boolean deleteOrder(@PathVariable String id){
        return orderService.deleteOrder(id);
    }

    @PutMapping("/order")
    public boolean updateOrder(@RequestBody Order order){
        return orderService.updateOrder(order);
    }
}

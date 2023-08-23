package com.example.springbootnodb.controller;

import com.example.springbootnodb.model.Order;
import com.example.springbootnodb.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/orders")
public class OrderController {
    private final OrderService orderService;

    @GetMapping
    public List<Order> getOrders() {
        return orderService.getOrderList();
    }
}

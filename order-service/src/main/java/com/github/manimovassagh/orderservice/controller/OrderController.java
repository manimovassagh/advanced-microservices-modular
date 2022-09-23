package com.github.manimovassagh.orderservice.controller;


import com.github.manimovassagh.orderservice.dto.OrderRequest;
import com.github.manimovassagh.orderservice.model.Order;
import com.github.manimovassagh.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderRequest orderRequest) {
        orderService.placeOrder(orderRequest);
        return "order Placed successfully";
    }




}

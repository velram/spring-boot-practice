package com.practice.spring.boot.springbootpractice.rest.dto.service;

import com.practice.spring.boot.springbootpractice.rest.dto.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public Order getOrderById(String orderId){

        Order sampleOrder = new Order("ORD001","15.02.2020","100");

        return sampleOrder;
    }
}

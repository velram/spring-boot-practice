package com.practice.spring.boot.springbootpractice.rest.dto.controller;

import com.practice.spring.boot.springbootpractice.rest.dto.Order;
import com.practice.spring.boot.springbootpractice.rest.dto.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Velmurugan Moorthy
 * This class is to demo the use of ResponseEntity
 */

@RequestMapping("/rest/practice")
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/response-entity/demo")
    public ResponseEntity<Order> getOrderDetails(@RequestParam("orderId") String orderId){
        Order fetchedOrder = orderService.getOrderById(orderId);
        return new ResponseEntity<>(fetchedOrder,HttpStatus.OK);
    }
}

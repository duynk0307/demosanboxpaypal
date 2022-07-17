package com.example.demosanboxpaypal.controller;

import com.example.demosanboxpaypal.entity.Orders;
import com.example.demosanboxpaypal.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value = "/orders", produces = MediaType.APPLICATION_JSON_VALUE)
public class OrderController {

    private final IOrdersService ordersService;

    @Autowired
    public OrderController(IOrdersService ordersService) {
        this.ordersService = ordersService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Object> addProduct(@RequestBody Orders order) {
        ordersService.save(order);
        return new ResponseEntity<>("Order is created successfully", HttpStatus.CREATED);
    }

}

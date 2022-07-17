package com.example.demosanboxpaypal.service;


import com.example.demosanboxpaypal.entity.Orders;

import java.util.List;

public interface IOrdersService {

    List<Orders> findAll();

    Orders findById(Long id);

    Orders save(Orders order);

    Orders findLastInsert();

    void deleteById(Long id);
}

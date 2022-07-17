package com.example.demosanboxpaypal.service;

import com.example.demosanboxpaypal.entity.Orders;
import com.example.demosanboxpaypal.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService implements IOrdersService{

    private final OrdersRepository ordersRepository;

    @Autowired
    public OrdersService(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    @Override
    public List<Orders> findAll() {
        return null;
    }

    @Override
    public Orders findById(Long id) {
        return null;
    }

    @Override
    public Orders save(Orders order) {
        return ordersRepository.save(order);
    }

    @Override
    public Orders findLastInsert() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}

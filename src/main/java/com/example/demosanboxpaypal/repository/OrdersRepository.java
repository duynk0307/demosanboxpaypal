package com.example.demosanboxpaypal.repository;

import com.example.demosanboxpaypal.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Long> {
}

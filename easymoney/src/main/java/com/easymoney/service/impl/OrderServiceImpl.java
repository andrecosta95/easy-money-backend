package com.easymoney.service.impl;

import com.easymoney.model.Order;
import com.easymoney.repository.OrderRepository;
import com.easymoney.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository repository;

    @Override
    public Order save(Order order) {
         return repository.save(order);
    }

    @Override
    public void deleteById(Long orderId) {
        repository.deleteById(orderId);
    }

    @Override
    public Optional<Order> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Order> findAll() {
        return repository.findAll();
    }
}

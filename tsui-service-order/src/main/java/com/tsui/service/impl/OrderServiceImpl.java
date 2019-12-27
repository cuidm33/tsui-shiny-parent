package com.tsui.service.impl;

import com.tsui.service.order.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public String findAll() {
        return "order findAll is ...";
    }
}

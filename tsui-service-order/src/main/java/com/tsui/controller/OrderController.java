package com.tsui.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.tsui.feign.product.BrandServiceFeign;
import com.tsui.feign.product.BrandServiceFeign;
import com.tsui.service.order.OrderService;
import com.tsui.service.product.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    BrandServiceFeign brandServiceFeign;

    @Autowired
    OrderService orderService;

    @RequestMapping("/findAll")
    public String findAll(){
        return orderService.findAll();
    }

    @RequestMapping("/findAllProduct")
    @HystrixCommand(fallbackMethod = "error")
    public String findAllProduct(){
        return brandServiceFeign.findAll();
    }

    public String error(){
        return "service call error.....";
    }



}

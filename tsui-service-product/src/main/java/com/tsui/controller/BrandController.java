package com.tsui.controller;

import com.tsui.service.product.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/brand")
public class BrandController {

    @Autowired
    BrandService brandService;

    @RequestMapping("/findAll")
    public String findAll(){
        return brandService.findAll();
    }
}

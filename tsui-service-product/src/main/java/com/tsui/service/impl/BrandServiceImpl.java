package com.tsui.service.impl;

import com.tsui.service.product.BrandService;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceImpl implements BrandService {
    @Override
    public String findAll() {
        return "product findAll is ...";
    }
}

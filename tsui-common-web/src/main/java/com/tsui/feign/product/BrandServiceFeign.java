package com.tsui.feign.product;

import com.tsui.config.ServerName;
import com.tsui.pojo.product.Brand;
import com.tsui.service.product.BrandService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = ServerName.TSUI_SERVICE_PRODUCT)
public interface BrandServiceFeign extends BrandService {

    @RequestMapping(value = "/brand/findAll")
    @Override
    List<Brand> findAll();
}

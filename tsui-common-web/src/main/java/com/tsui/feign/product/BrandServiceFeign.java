package com.tsui.feign.product;

import com.tsui.config.ServerName;
import com.tsui.service.product.BrandService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = ServerName.TSUI_SERVICE_PRODUCT)
public interface BrandServiceFeign extends BrandService {

    @RequestMapping(value = "/brand/findAll")
    @Override
    String findAll();
}

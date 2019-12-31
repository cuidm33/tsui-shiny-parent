package com.tsui.feign.product;

import com.tsui.config.ServerName;
import com.tsui.entity.PageResult;
import com.tsui.pojo.goods.Brand;
import com.tsui.service.product.BrandService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@FeignClient(value = ServerName.TSUI_SERVICE_PRODUCT)
public interface BrandServiceFeign extends BrandService {

    @RequestMapping(value = "/brand/findAll")
    @Override
    List<Brand> findAll();

    @Override
    PageResult<Brand> findPage(int page, int size);

    @Override
    List<Brand> findList(Map<String, Object> searchMap);

    @Override
    PageResult<Brand> findPage(Map<String, Object> searchMap, int page, int size);

    @Override
    Brand findById(Integer id);

    @Override
    void add(Brand brand);

    @Override
    void update(Brand brand);

    @Override
    void delete(Integer id);
}

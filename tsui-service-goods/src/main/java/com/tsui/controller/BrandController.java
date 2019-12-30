package com.tsui.controller;

import com.tsui.entity.PageResult;
import com.tsui.entity.Result;
import com.tsui.pojo.goods.Brand;
import com.tsui.service.product.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/brand")
@CrossOrigin
public class BrandController {

    @Autowired
    private BrandService brandService;

    //5.3.1 品牌列表
    @GetMapping("/findAll")
    public List<Brand> findAll(){
        return brandService.findAll();
    }

    //5.3.2 品牌分页列表
    @GetMapping("/findPage")
    public PageResult<Brand> findPage(int page, int size){
        return brandService.findPage(page, size);
    }

    //5.3.3 品牌条件查询
    @PostMapping("/findList")
    public List<Brand> findList(@RequestBody Map<String,Object> searchMap){
        return brandService.findList(searchMap);
    }

    //5.3.4 品牌条件+分页查询
    @PostMapping("/findPage")
    public PageResult<Brand> findPage(@RequestBody Map<String,Object> searchMap,int page,int size){
        return brandService.findPage(searchMap,page, size);
    }

    //5.3.5 根据ID查询品牌
    @GetMapping("/findById")
    public Brand findById(Integer id){
        return brandService.findById(id);
    }

    //5.3.6 品牌新增
    @PostMapping("/add")
    public Result add(@RequestBody Brand brand){
        brandService.add(brand);
        return new Result();
    }

    //5.3.7 品牌修改
    @PostMapping("/update")
    public Result update(@RequestBody Brand brand){
        brandService.update(brand);
        return new Result();
    }

    //5.3.8 品牌删除
    @GetMapping("/delete")
    public Result delete(Integer id){
        brandService.delete(id);
        return new Result();
    }

}

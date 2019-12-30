package com.tsui;

import com.tsui.dao.BrandMapper;
import com.tsui.pojo.product.Brand;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest(classes = TsuiProductApplication.class)
@RunWith(SpringRunner.class)
public class BrandTest {

    @Resource
    BrandMapper mapper;

    @Test
    public void test01(){

        System.out.println(mapper.selectAll());
    }
}

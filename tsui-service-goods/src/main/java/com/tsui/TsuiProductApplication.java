package com.tsui;

import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrix
@EnableHystrixDashboard
@MapperScan("com.tsui.dao")
public class TsuiProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(TsuiProductApplication.class,args);
    }
}

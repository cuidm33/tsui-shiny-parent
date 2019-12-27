package com.tsui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TsuiEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(TsuiEurekaApplication.class,args);
    }
}
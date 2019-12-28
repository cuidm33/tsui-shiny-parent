package com.tsui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
public class TsuiTurbineApplication {
    public static void main(String[] args) {
        SpringApplication.run(TsuiTurbineApplication.class,args);
    }
}

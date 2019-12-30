package com.tsui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class TsuiConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(TsuiConfigApplication.class, args);
    }

}

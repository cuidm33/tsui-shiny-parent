package com.tsui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class TsuiZipKinApplication {
    public static void main(String[] args) {
        SpringApplication.run(TsuiZipKinApplication.class,args);
    }
}

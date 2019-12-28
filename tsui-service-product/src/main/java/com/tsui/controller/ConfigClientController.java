package com.tsui.controller;

import com.tsui.config.InfoConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ConfigClientController {

/*    @Value("${spring.application.name}")
    private String applicationName;
    @Value("${eureka.client.serviceUrl.defaultZone}")
    private String eurekaServers;*/

    @Resource
    private InfoConfig infoConfig;

    @RequestMapping("/config")
    public String getConfig() {
        return infoConfig.toString();
    }
}

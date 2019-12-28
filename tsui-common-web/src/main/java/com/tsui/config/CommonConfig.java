package com.tsui.config;

import brave.sampler.Sampler;
import com.netflix.loadbalancer.IRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CommonConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Bean
    public IRule rule(){// 其中IRule就是所有规则的标准
        return new com.netflix.loadbalancer.RandomRule();// 随机的访问策略
    }

    @Bean
    public Sampler defaultSampler() {//zipkin固定配置
        return Sampler.ALWAYS_SAMPLE;
    }
}

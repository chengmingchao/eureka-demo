package com.cmc.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClient9091 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClient9091.class,args);
    }
}

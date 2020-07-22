package com.cmc.eureka.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaController {

    @Value("${server.port}")
    private String port;

    @GetMapping("getPort")
    public String getPort(){
        return port;
    }
}

package com.cmc.eureka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EurekaController {

    private static String url="http://EUREKA-CLIENT";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("get")
    public String getPort(){
        String port = restTemplate.getForObject(url + "/getPort", String.class);
        System.out.println(port);
        return port;
    }
}

package com.stream.authentication.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@ConfigurationProperties(prefix = "property-access-service")
@RequestMapping("/api")
public class ConfigServerController {


    @Value("property-file.name")
    private static String name;
    @Value("property-file.description")
    private static String description;

    @GetMapping("/")
    public  void readConfigServerProerties(){

        System.out.println("name :" + name + "  :  "+"description : "+ description);
    }
}

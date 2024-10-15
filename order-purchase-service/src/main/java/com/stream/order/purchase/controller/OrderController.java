package com.stream.order.purchase.controller;


import com.stream.order.purchase.model.Property;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class OrderController {

    @Autowired
    private Property property;

    @GetMapping("/reading")

    public Property getAllProperty(){
        refreshActuator();
        return property;
    }
    public void refreshActuator(){
        RestTemplate restTemplate=new RestTemplate();
        final String baseUrl="http://localhost:8600/actuator/refresh";

        HttpHeaders headers=new HttpHeaders();
        headers.set("Content-Type","application/json");
        String token ="enylslsllsljfn";
        headers.set("Authorization", "Bearer " + token);
        HttpEntity entity=new HttpEntity(headers);

        ResponseEntity<String> results=restTemplate.postForEntity(baseUrl,entity,String.class);


    }
}

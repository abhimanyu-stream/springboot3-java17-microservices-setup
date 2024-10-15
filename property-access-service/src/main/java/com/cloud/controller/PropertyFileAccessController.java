package com.cloud.controller;



import com.cloud.model.PropertyAccessBean;
import com.cloud.model.PropertyAccessValue;
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
public class PropertyFileAccessController {
// http://localhost:8100/read/access
    @Autowired
    PropertyAccessBean propertyAccessBean;

    @GetMapping("/read")
    public PropertyAccessValue accesPropertyFile(){

        //refreshActuator();
        return new PropertyAccessValue(propertyAccessBean.getName(),propertyAccessBean.getDescription());
    }


    public void refreshActuator(){
        RestTemplate restTemplate=new RestTemplate();
        final String baseUrl="http://localhost:8100/actuator/refresh";

        HttpHeaders headers=new HttpHeaders();
        headers.set("Content-Type","application/json");
        String token ="enylslsllsljfn";
        headers.set("Authorization", "Bearer " + token);
        HttpEntity entity=new HttpEntity(headers);

        ResponseEntity<String> results=restTemplate.postForEntity(baseUrl,entity,String.class);


    }

}

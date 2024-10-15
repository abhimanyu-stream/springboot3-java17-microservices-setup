package com.stream.apigateway.configuration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.HashMap;
import java.util.Map;

@Component
@Slf4j
public class JwtService {

    // do rest call to authentication-service and get all details about token and user inside token

    private final WebClient webClient;

    public JwtService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("http://localhost:8500/users").build();
    }

    public String validateTokenFromExternalApi(String token) {
        try {
            return webClient.get()
                    .uri("/validate/token?token")
                    .retrieve()
                    .bodyToMono(String.class)
                    .block(); // Blocking call to get the response
        } catch (RestClientResponseException e) {
            // Handle specific HTTP error responses
            return e.getMessage();
        } catch (RestClientException e) {
            // Handle other exceptions (e.g., network issues)
            return e.getMessage();
        }
    }
}

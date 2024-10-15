package com.stream.apigateway.configuration;

import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Predicate;

@Component
public class RouterValidator {

    public static final List<String> openApiEndpoints = List.of("/users/**");//authentication-service RquestMapping

    public Predicate<ServerHttpRequest> isSecuredApi = (request) -> openApiEndpoints.stream().noneMatch(uri -> request.getURI().getPath().contains(uri));

}

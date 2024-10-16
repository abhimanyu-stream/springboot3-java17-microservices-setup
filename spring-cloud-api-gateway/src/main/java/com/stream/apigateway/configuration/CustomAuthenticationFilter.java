package com.stream.apigateway.configuration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;
import reactor.core.publisher.Mono;

@RefreshScope
@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
@Slf4j
public class CustomAuthenticationFilter implements GatewayFilter, WebFilter {

	private final RouterValidator validator;
	private final JwtService jwtService;

	@Autowired
	public CustomAuthenticationFilter(RouterValidator validator, JwtService jwtService) {
		this.validator = validator;
		this.jwtService = jwtService;
	}



	public Mono<Void> filter(ServerWebExchange exchange, WebFilterChain chain) {
		log.debug("CustomAuthenticationFilter: Filtering request...");
		ServerHttpRequest request = exchange.getRequest();

		if (validator.isSecuredApi.test(request)) {
			log.debug("Request is secured. Checking authorization...");
			if (!exchange.getRequest().getHeaders().containsKey(HttpHeaders.AUTHORIZATION)) {
				log.warn("Authorization header is missing.");

				// can we redirect to authentication-service from here
				return onError(exchange, HttpStatus.UNAUTHORIZED);
			}

			String authHeader = exchange.getRequest().getHeaders().get(HttpHeaders.AUTHORIZATION).get(0);
			String token = null;
			if (authHeader != null && authHeader.startsWith("Bearer ")) {
				token = authHeader.substring(7);
			}
			if (token == null ) {
				log.warn("Token validation failed.");
				return onError(exchange, HttpStatus.UNAUTHORIZED);
			}
			if(token != null){
				String username = jwtService.validateTokenFromExternalApi(token);
				if(username != null){
					log.debug("Token validation passed.");
					request = (ServerHttpRequest) exchange.getRequest().mutate().header("loggedInUser", username).build();
				}
			}
		}else {
			log.debug("Request is not secured. Skipping authentication.");
		}

		return chain.filter((ServerWebExchange) exchange.mutate().request(request));// forwarding the username who has requested for a URI in any of SERVICE
	}

	private Mono<Void> onError(ServerWebExchange exchange, HttpStatus httpStatus) {
		log.debug("Authentication error. Responding with status: {}", httpStatus);
		ServerHttpResponse response = exchange.getResponse();
		response.setStatusCode(httpStatus);
		return response.setComplete();
	}

	/*private boolean authMissing(ServerHttpRequest request) {
		return !request.getHeaders().containsKey("Authorization");
	}*/

	private String getAuthHeader(ServerHttpRequest request) {
		String header = request.getHeaders().getOrEmpty("Authorization").stream()
				.findFirst()
				.orElse("");
		if (!header.isEmpty() && header.startsWith("Bearer ")) {
			return header.substring(7);
		}
		return header;
	}


	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		log.debug("CustomAuthenticationFilter: Filtering request...");
		ServerHttpRequest request = exchange.getRequest();

		if (validator.isSecuredApi.test(request)) {
			log.debug("Request is secured. Checking authorization...");
			if (!exchange.getRequest().getHeaders().containsKey(HttpHeaders.AUTHORIZATION)) {
				log.warn("Authorization header is missing.");
				return onError(exchange, HttpStatus.UNAUTHORIZED);
			}

			String authHeader = exchange.getRequest().getHeaders().get(HttpHeaders.AUTHORIZATION).get(0);
			String token = null;
			if (authHeader != null && authHeader.startsWith("Bearer ")) {
				token = authHeader.substring(7);
			}
			if (token == null ) {
				log.warn("Token validation failed.");
				return onError(exchange, HttpStatus.UNAUTHORIZED);
			}
			if(token != null){
				String username = jwtService.validateTokenFromExternalApi(token);
				if(username != null){
					log.debug("Token validation passed.");
					request = (ServerHttpRequest) exchange.getRequest().mutate().header("loggedInUser", username).build();
				}
			}
		}else {
			log.debug("Request is not secured. Skipping authentication.");
		}

		return chain.filter((ServerWebExchange) exchange.mutate().request(request));// forwarding the username who has requested for a URI in any of SERVICE
	}


}
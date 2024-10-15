package com.stream.apigateway.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

import java.util.Arrays;

@Configuration
public class CORSConfiguration {

    @Bean
    CorsWebFilter corsWebFilter() {
        CorsConfiguration corsConfig = new CorsConfiguration();
        corsConfig.setAllowedOrigins(Arrays.asList("http://localhost:*", "127.0.0.1:*"));
        corsConfig.setMaxAge(8000L);
        corsConfig.addAllowedMethod("POST");
        corsConfig.addAllowedMethod("GET");
        corsConfig.addAllowedMethod("PUT");
        corsConfig.addAllowedMethod("DELETE");
        corsConfig.addAllowedMethod("PATCH");
        corsConfig.addAllowedMethod("HEAD");
        corsConfig.addAllowedMethod("OPTIONS");
        corsConfig.addAllowedMethod("CONNECT");
        corsConfig.addAllowedMethod("TRACE");
        corsConfig.setExposedHeaders(Arrays.asList("Access-Control-Allow-Origin","Access-Control-Allow-Credentials","Access-Control-Allow-Methods","Access-Control-Allow-Headers","Access-Control-Expose-Headers","Access-Control-Max-Age","X-Get-Header"));
        corsConfig.setAllowCredentials(true);//for cookies like
        corsConfig.addAllowedHeader("Authorization");
        corsConfig.addAllowedHeader("Origin");
        corsConfig.addAllowedHeader("Requestor-Type");
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", corsConfig);

        return new CorsWebFilter(source);
    }
    /**
     * @GetMapping("/my-resource")
    public ResponseEntity<String> getMyResource(@RequestHeader("Authorization") String authorizationHeader) {
    // Validate the token or key here
    // Your business logic
    return ResponseEntity.ok("Hello, authorized user!");
    }

     * **/
}

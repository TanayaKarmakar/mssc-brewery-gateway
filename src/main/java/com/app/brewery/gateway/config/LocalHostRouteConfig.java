package com.app.brewery.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author t0k02w6 on 14/06/21
 * @project mssc-brewery-gateway
 */
@Configuration
public class LocalHostRouteConfig {
    @Bean
    public RouteLocator localHostRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/api/v1/beer*","/api/v1/beer/*", "/api/v1/beer/upc/*")
                .uri("http://localhost:9091/")
                .id("beer-service"))
                .build();
    }
}

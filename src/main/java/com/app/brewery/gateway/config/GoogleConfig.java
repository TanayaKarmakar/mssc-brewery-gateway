package com.app.brewery.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author t0k02w6 on 12/06/21
 * @project mssc-brewery-gateway
 */
@Profile("google")
@Configuration
public class GoogleConfig {
    @Bean
    public RouteLocator googleRouteConfig(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/googlesearch")
                .uri("https://www.google.com/")
                .id("google"))
                .build();
    }
}


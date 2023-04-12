package com.reboot.movigation.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import lombok.RequiredArgsConstructor;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
        info = @Info(
                title = "Movigation RESTful API",
                description = "영화 추천 플랫폼 Movigation의 명세서",
                version = "1.0.0"
        )
)

@Configuration
@RequiredArgsConstructor
public class SwaggerConfig {
    // url: movigation.app

    @Bean
    public GroupedOpenApi UserApi() {
        String[] paths = {"/api/v1/movigation/user/**"};

        return GroupedOpenApi
                .builder()
                .group("User API")
                .pathsToMatch(paths)
                .build();
    }

}

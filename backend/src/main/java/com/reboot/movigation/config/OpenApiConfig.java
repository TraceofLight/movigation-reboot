package com.reboot.movigation.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI openAPI() {

        Info info = new Info()
                .version("v0.1.0")
                .title("Movigation Swagger API")
                .description("Movigation의 API 내용을 담은 페이지");

        return new OpenAPI()
                .info(info);
    }

}
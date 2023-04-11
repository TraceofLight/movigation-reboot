package com.reboot.movigation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.function.Predicate;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    // url: movigation.app

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Movigation Spring Boot REST API")
                .version("1.0.0")
                .description("영화 추천 플랫폼 Movigation의 Descriptions")
                .build();
    }

    public Docket getDocket(String groupName, Predicate<String> predicate) {
        return new Docket(DocumentationType.SWAGGER_2).groupName(groupName).apiInfo(apiInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("com.reboot.movigation")).paths(predicate::test)
                .build();
    }

    @Bean
    public Docket userApi() {
        return getDocket("회원", (path) -> path.matches("api/v1/movigation/user.*"));
    }


}

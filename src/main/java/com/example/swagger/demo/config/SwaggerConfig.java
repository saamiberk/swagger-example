package com.example.swagger.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket swaggerConfiguration(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(PathSelectors.ant("/users/*")) //restrict base on endpoint
                .apis(RequestHandlerSelectors.basePackage("com.example.swagger.demo")) // restrict base on package
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo(){
        return new ApiInfo(
                "Swagger Test API",
                "Sample API for Github",
                "1.0",
                "Free to use",
                new springfox.documentation.service.Contact("Berk", "https://github.com","s@s.com"),
                "API License",
                "http://github.com",
                Collections.emptyList());
      }


}

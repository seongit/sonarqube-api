package com.dev.sonarqubeapi.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
        info = @Info(title = "SonarQube API 명세서"
        , description = "소나큐브 API를 활용해서 사부작 사부작 이것 저것 만듭니다."
        , version = "v1")
)
@Configuration
public class SwaggerConfig {


}
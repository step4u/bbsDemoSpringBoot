package com.example.bbsDemo.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("BBS Demo API")
                .description("게시판 데모 API 문서")
                .version("v1.0.0")
                .contact(new Contact()
                    .name("개발팀")
                    .email("dev@example.com")));
    }

}

package sn.admin.api.config;

import io.swagger.v3.oas.models.*;
import io.swagger.v3.oas.models.info.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springdoc.core.models.GroupedOpenApi;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI senegalAdminOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API Administrative du Sénégal")
                        .description("Documentation complète des API de gestion des régions, départements et communes du Sénégal")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Dienaba Fily Bodiang")
                                .email("dienabafilybodiang@gmail.com")
                                .url("https://github.com/dienabafily")));
    }

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("senegal-admin-api")
                .pathsToMatch("/api/**")
                .build();
    }
}

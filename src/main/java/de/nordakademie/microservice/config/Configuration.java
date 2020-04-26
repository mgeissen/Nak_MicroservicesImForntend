package de.nordakademie.microservice.config;

import org.springframework.context.annotation.Bean;
import org.thymeleaf.templateresolver.UrlTemplateResolver;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public UrlTemplateResolver urlTemplateResolver() {
        return new UrlTemplateResolver();
    }

}

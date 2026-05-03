package com.lucasgomes.auth_access_service.infrastructure.config;

import com.lucasgomes.auth_access_service.application.usecase.CreateUserUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public CreateUserUseCase createUserUseCase() {
        return new CreateUserUseCase();
    }
}
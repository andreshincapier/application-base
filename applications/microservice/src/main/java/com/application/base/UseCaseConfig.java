package com.application.base;

import com.application.base.usecase.RamUseCase;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public ModelMapper objectMapper() {
        return new ModelMapper();
    }

    @Bean
    public RamUseCase submitTaskCommandUseCase() {
        return new RamUseCase();
    }
}

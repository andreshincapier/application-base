package com.application.base;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class UseCaseConfigTest {

    @InjectMocks
    UseCaseConfig config;

    @Test
    public void objectMapperIsNotNull() {
        config.objectMapper();
    }

    @Test
    public void submitTaskCommandUseCase() {
        config.submitTaskCommandUseCase();
    }
}
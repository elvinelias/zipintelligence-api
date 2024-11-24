package com.zipintelligence;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(info = @Info(title = "Zipintelligence API",version = "1.0.0",description = "Zipintelligence APIs for UI and services"))
public class SwaggerConfig {



}
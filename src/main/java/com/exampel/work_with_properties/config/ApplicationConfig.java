package com.exampel.work_with_properties.config;

import com.exampel.work_with_properties.config.props.DealerShipProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @ConfigurationProperties(prefix = "app.dealership")
    @Bean
    public DealerShipProperties dealerShipProperties (){
        return new DealerShipProperties();
    }
}

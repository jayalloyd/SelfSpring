package com.meenuscuisines.config;

import com.meenuscuisines.Desktop;
import com.meenuscuisines.Laptop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Desktop desktop(){
        return new Desktop();

    }
    @Bean
    public Laptop laptop(){
        return new Laptop();

    }

}

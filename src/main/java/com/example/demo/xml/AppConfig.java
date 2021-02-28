package com.example.demo.xml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@EnableApolloConfig
public class AppConfig {

    @Bean
    public AppFile javaConfigBean() {
        return new AppFile();
    }

}
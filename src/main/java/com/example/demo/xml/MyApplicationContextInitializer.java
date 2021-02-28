package com.example.demo.xml;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class MyApplicationContextInitializer // implements  ApplicationContextInitializer<ConfigurableApplicationContext>
      {




  /*  public void initialize(ConfigurableApplicationContext applicationContext) {
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        String cluster = environment.getProperty("myapollo.cluster");
        String env = environment.getProperty("myapollo.env");
        if (Strings.isNullOrEmpty(cluster)) {
            return;
        }

        System.setProperty("env",env);
        System.setProperty("apollo.cluster", cluster);
    }*/
}

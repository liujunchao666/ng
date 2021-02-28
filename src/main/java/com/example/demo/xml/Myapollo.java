package com.example.demo.xml;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.stereotype.Component;

//@Component
public class Myapollo  {
    @Value("${myapollo.cluster}")
    String cluster;
    @Value("${myapollo.env}")
    String env;

    public String getCluster() {
        return cluster;
    }

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }


/*    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application.properties) {


    }*/

    //？？

  /*  @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        System.setProperty("apollo.cluster", cluster);
        System.setProperty("env", env);

    }*/
}

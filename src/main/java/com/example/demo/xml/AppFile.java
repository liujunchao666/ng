package com.example.demo.xml;

import org.springframework.beans.factory.annotation.Value;

public class AppFile {
 //   @Value("${debug}")
    String debug;

    public String getDebug() {
        return debug;
    }

    public void setDebug(String debug) {
        System.out.println(debug);
        this.debug = debug;
    }
}

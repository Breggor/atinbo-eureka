package com.atinbo.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AtinboEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(AtinboEurekaApplication.class, args);
    }
}


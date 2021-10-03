package com.geekcolab.development.springbootfeignsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringBootFeignSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootFeignSampleApplication.class, args);
    }

}

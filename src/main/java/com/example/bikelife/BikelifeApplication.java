package com.example.bikelife;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class BikelifeApplication {

    public static void main(String[] args) {

        SpringApplication.run(BikelifeApplication.class, args);
    }

}

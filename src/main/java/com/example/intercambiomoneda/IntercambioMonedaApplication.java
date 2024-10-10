package com.example.intercambiomoneda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class IntercambioMonedaApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntercambioMonedaApplication.class, args);
    }
}

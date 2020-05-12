package com.dca.sio.app.usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EntityScan({"com.dca.sio.app.users.commons.model.entity"})
public class SioAppUsuarioServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SioAppUsuarioServiceApplication.class, args);
    }

}

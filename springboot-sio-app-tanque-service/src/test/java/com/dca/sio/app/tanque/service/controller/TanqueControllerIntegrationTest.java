package com.dca.sio.app.tanque.service.controller;

import com.dca.sio.app.tanque.service.model.entity.Almacenamiento;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;


import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = RANDOM_PORT)
public class TanqueControllerIntegrationTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void obtenerTanquePorIdTest(){

        ResponseEntity<Almacenamiento> response = restTemplate.getForEntity("/tanque/1001", Almacenamiento.class);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody().getCodAlmacen()).isEqualTo("1001");
        assertThat(response.getBody().getNombre()).isEqualTo(" TANQUE 1001");


    }
}

package com.dca.sio.app.masterdata.service.controller;


import com.dca.sio.app.masterdata.service.model.entity.UnidadMedida;
import com.dca.sio.app.masterdata.service.model.service.IUnidadMedidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UnidadMedidaController {

    @Autowired
    private IUnidadMedidaService medidaService;


    @GetMapping("/unidadesmedida")
    public List<UnidadMedida> findAll(){
        return medidaService.findAllUnidadMedida();
    }

    @GetMapping("/unidadmedida/{codUnidadMedida}")
    public UnidadMedida findUnidadMedida(@PathVariable String codUnidadMedida){
        return medidaService.findByCodUnidadMedida(codUnidadMedida);
    }

    @PostMapping("/createUom")
    @ResponseStatus(HttpStatus.CREATED)
    public UnidadMedida create(@RequestBody UnidadMedida unidadMedida){
        return medidaService.createUnidadMedida(unidadMedida);
    }

    @PutMapping("/editUom/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public UnidadMedida edit(@PathVariable Long id, @RequestBody UnidadMedida unidadMedida) throws Exception {
        return medidaService.editUnidadMedida(id, unidadMedida);
    }

    @DeleteMapping("/deleteUom/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        medidaService.deleteUnidadMedida(id);
    }
}

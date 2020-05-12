package com.dca.sio.app.masterdata.service.controller;

import com.dca.sio.app.masterdata.service.model.entity.TipoTecho;
import com.dca.sio.app.masterdata.service.model.service.ITipoTechoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TipoTechoController {

    @Autowired
    private ITipoTechoService techoService;


    @GetMapping("/tipostechos")
    public List<TipoTecho> findAll(){
        return techoService.findAllTipoTecho();
    }

    @GetMapping("/tipotecho/{codTipoTecho}")
    public TipoTecho findTipoTecho(@PathVariable String codTipoTecho){
        return techoService.findByCodTipoTecho(codTipoTecho);
    }

    @PostMapping("/createTipoTecho")
    @ResponseStatus(HttpStatus.CREATED)
    public TipoTecho create(@RequestBody TipoTecho tipoTecho){
        return techoService.createTipoTecho(tipoTecho);
    }

    @PutMapping("/editTipoTecho/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public TipoTecho edit(@PathVariable Long id, @RequestBody TipoTecho tipoTecho) throws Exception {
        return techoService.editTipoTecho(id, tipoTecho);
    }

    @DeleteMapping("/deleteTipoTecho/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        techoService.deleteTipoTecho(id);
    }
}

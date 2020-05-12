package com.dca.sio.app.masterdata.service.controller;

import com.dca.sio.app.masterdata.service.model.entity.TipoAforo;
import com.dca.sio.app.masterdata.service.model.service.ITipoAforoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TipoAforoController {

    @Autowired
    private ITipoAforoService aforoService;

    @GetMapping("/tiposaforos")
    public List<TipoAforo> findByAllTipoAforo(){
        return aforoService.findAllTipoAforo();
    }

    @GetMapping("/tipoaforo/{codTipoAforo}")
    public TipoAforo findByIdTipoAforo(@PathVariable String codTipoAforo){
        return aforoService.findByCodTipoAforo(codTipoAforo);
    }

    @PostMapping("/createTipoAforo")
    @ResponseStatus(HttpStatus.CREATED)
    public TipoAforo create(@RequestBody TipoAforo tipoAforo){
        return aforoService.createTipoAforo(tipoAforo);
    }

    @PutMapping("/editTipoAforo/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public TipoAforo edit(@PathVariable Long id, @RequestBody TipoAforo tipoAforo) throws Exception {
        return aforoService.editTipoAforo(id, tipoAforo);
    }

    @DeleteMapping("/deleteTipoAforo/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        aforoService.deleteTipoAforo(id);
    }
}

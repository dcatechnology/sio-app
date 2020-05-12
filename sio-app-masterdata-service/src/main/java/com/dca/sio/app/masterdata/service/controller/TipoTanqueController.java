package com.dca.sio.app.masterdata.service.controller;

import com.dca.sio.app.masterdata.service.model.entity.TipoTanque;
import com.dca.sio.app.masterdata.service.model.service.ITipoTanqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TipoTanqueController {

    @Autowired
    private ITipoTanqueService tanqueService;

    @GetMapping("/tipostanques")
    public List<TipoTanque> findAllTipoTanque(){
        return tanqueService.findAllTipoTanque();
    }

    @GetMapping("/tipotanque/{codTipoTanque}")
    public TipoTanque findByCodTipoTanque(@PathVariable String codTipoTanque){
        return tanqueService.findByCodTipoTanque(codTipoTanque);
    }

    @PostMapping("/createTipoTanque")
    @ResponseStatus(HttpStatus.CREATED)
    public TipoTanque create(@RequestBody TipoTanque tipoTanque){
        return tanqueService.createTipoTanque(tipoTanque);
    }

    @PutMapping("/editTipoTanque/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public TipoTanque edit(@PathVariable Long id, TipoTanque tipoTanque) throws Exception {
        return tanqueService.editTipoTanque(id, tipoTanque);
    }

    @DeleteMapping("/deleteTipoTanque/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        tanqueService.deleteTipoTanque(id);
    }
}

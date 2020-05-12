package com.dca.sio.app.masterdata.service.controller;

import com.dca.sio.app.masterdata.service.model.entity.Color;
import com.dca.sio.app.masterdata.service.model.service.IColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ColorController {

    @Autowired
    private IColorService colorService;


    @GetMapping("/colores")
    public List<Color> findByAllColor(){
        return colorService.findAllColors();
    }

    @GetMapping("/color/{codColor}")
    public Color findByColor(@PathVariable String codColor){
        return colorService.findByCodColor(codColor);
    }

    @PostMapping("/createColor")
    @ResponseStatus(HttpStatus.CREATED)
    public Color create(@RequestBody Color color){
        return colorService.createColor(color);
    }

    @PutMapping("/editColor/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Color edit(@PathVariable Long id, @RequestBody Color color) throws Exception {
        return colorService.editColor(id, color);
    }

    @DeleteMapping("/deleteColor/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        colorService.deleteColor(id);
    }
}

package com.dca.sio.app.masterdata.service.model.service;

import com.dca.sio.app.masterdata.service.model.entity.Color;

import java.util.List;


public interface IColorService {

    List<Color> findAllColors();
    Color findByCodColor(String codColor);

    Color createColor(Color color);
    Color editColor(Long id, Color color) throws Exception;
    void deleteColor(Long id);
}

package com.dca.sio.app.masterdata.service.model.repository;

import com.dca.sio.app.masterdata.service.model.entity.Color;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IColorDao extends CrudRepository<Color, Long> {
    Color findByCodColor(String codColor);
}

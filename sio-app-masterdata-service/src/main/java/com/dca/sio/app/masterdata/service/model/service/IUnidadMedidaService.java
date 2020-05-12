package com.dca.sio.app.masterdata.service.model.service;

import com.dca.sio.app.masterdata.service.model.entity.UnidadMedida;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IUnidadMedidaService {

    List<UnidadMedida> findAllUnidadMedida();
    UnidadMedida findByCodUnidadMedida(String codUnidadMedida);

    UnidadMedida createUnidadMedida(UnidadMedida unidadMedida);
    UnidadMedida editUnidadMedida(Long id, UnidadMedida unidadMedida) throws Exception;
    void deleteUnidadMedida(Long id);
}

package com.dca.sio.app.masterdata.service.model.service;

import com.dca.sio.app.masterdata.service.model.entity.TipoTecho;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ITipoTechoService {

    List<TipoTecho> findAllTipoTecho();
    TipoTecho findByCodTipoTecho(String codTipoTecho);

    TipoTecho createTipoTecho(TipoTecho tipoTecho);
    TipoTecho editTipoTecho(Long id, TipoTecho tipoTecho) throws Exception;
    void deleteTipoTecho(Long id);
}

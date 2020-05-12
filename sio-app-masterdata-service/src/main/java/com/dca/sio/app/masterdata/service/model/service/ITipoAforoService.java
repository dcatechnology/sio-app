package com.dca.sio.app.masterdata.service.model.service;


import com.dca.sio.app.masterdata.service.model.entity.TipoAforo;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ITipoAforoService {

    List<TipoAforo> findAllTipoAforo();
    TipoAforo findByCodTipoAforo(String codTipoAforo);

    TipoAforo createTipoAforo(TipoAforo tipoAforo);
    TipoAforo editTipoAforo(Long id, TipoAforo tipoAforo) throws Exception;
    void deleteTipoAforo(Long id);
}

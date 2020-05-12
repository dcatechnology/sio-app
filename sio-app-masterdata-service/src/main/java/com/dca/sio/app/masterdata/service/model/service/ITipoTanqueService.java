package com.dca.sio.app.masterdata.service.model.service;

import com.dca.sio.app.masterdata.service.model.entity.TipoTanque;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ITipoTanqueService {

    List<TipoTanque> findAllTipoTanque();
    TipoTanque findByCodTipoTanque(String codTipoTanque);

    TipoTanque createTipoTanque(TipoTanque tipoTanque);
    TipoTanque editTipoTanque(Long id, TipoTanque tipoTanque) throws Exception;
    void deleteTipoTanque(Long id);
}

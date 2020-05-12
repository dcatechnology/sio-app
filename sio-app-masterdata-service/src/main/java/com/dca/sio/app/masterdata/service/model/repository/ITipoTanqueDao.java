package com.dca.sio.app.masterdata.service.model.repository;

import com.dca.sio.app.masterdata.service.model.entity.TipoTanque;
import org.springframework.data.repository.CrudRepository;

public interface ITipoTanqueDao extends CrudRepository<TipoTanque, Long> {
    TipoTanque findByCodTipotanque(String codTipoTanque);
}

package com.dca.sio.app.masterdata.service.model.repository;

import com.dca.sio.app.masterdata.service.model.entity.TipoAforo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITipoAforoDao extends CrudRepository<TipoAforo, Long> {
    TipoAforo findByCodTipoaforo(String codTipoAforo);
}

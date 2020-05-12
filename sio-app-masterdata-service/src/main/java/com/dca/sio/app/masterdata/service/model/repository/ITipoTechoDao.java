package com.dca.sio.app.masterdata.service.model.repository;

import com.dca.sio.app.masterdata.service.model.entity.TipoTecho;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITipoTechoDao extends CrudRepository<TipoTecho, Long> {
    TipoTecho findByCodTipoTecho(String codTipoTecho);
}

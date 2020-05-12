package com.dca.sio.app.masterdata.service.model.repository;

import com.dca.sio.app.masterdata.service.model.entity.UnidadMedida;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUnidadMedidaDao extends CrudRepository<UnidadMedida, Long> {
    UnidadMedida findByCodUnidadMedida(String codUnidadMedida);
}

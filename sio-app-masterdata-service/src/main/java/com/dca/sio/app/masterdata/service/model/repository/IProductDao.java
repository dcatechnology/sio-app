package com.dca.sio.app.masterdata.service.model.repository;

import com.dca.sio.app.masterdata.service.model.entity.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductDao extends CrudRepository<Producto, Long>{
    Producto findByCodProducto(String codProducto);
    Producto findByDescripcion(String descipcion);
}

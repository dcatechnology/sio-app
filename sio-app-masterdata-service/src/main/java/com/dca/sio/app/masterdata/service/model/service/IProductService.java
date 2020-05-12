package com.dca.sio.app.masterdata.service.model.service;

import com.dca.sio.app.masterdata.service.model.entity.Producto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IProductService {

    List<Producto> findAllProducts();
    Producto findByCodProducto(String codProducto);
    Producto findByDescripcion(String descripcion);

    Producto createProduct(Producto producto);
    Producto editProduct(Long id, Producto producto) throws Exception;
    void deleteProduct(Long id);

}

package com.dca.sio.app.masterdata.service.model.service.implement;

import com.dca.sio.app.masterdata.service.model.entity.Producto;
import com.dca.sio.app.masterdata.service.model.repository.IProductDao;
import com.dca.sio.app.masterdata.service.model.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService implements IProductService {

    @Autowired
    private IProductDao productDao;

    @Override
    @Transactional(readOnly = true)
    public List<Producto> findAllProducts() {
        return (List<Producto>)productDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Producto findByCodProducto(String codProducto) {
        return productDao.findByCodProducto(codProducto);
    }

    @Override
    @Transactional(readOnly = true)
    public Producto findByDescripcion(String descripcion) {
        return productDao.findByDescripcion(descripcion);
    }

    @Override
    @Transactional
    public Producto createProduct(Producto producto) {
        return productDao.save(producto);
    }

    @Override
    @Transactional
    public Producto editProduct(Long id, Producto producto) throws Exception {

       Producto findProducto = productDao.findById(id).orElse(null);

       if(findProducto == null){
           throw new Exception("El registro que trata de buscar no se encuentra disponible.");
       }

       findProducto.setCodProducto(producto.getCodProducto());
       findProducto.setDescripcion(producto.getDescripcion());

        return productDao.save(findProducto);
    }

    @Override
    @Transactional
    public void deleteProduct(Long id) {
        productDao.deleteById(id);
    }
}

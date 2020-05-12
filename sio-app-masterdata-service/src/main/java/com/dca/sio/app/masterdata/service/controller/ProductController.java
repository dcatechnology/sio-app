package com.dca.sio.app.masterdata.service.controller;

import com.dca.sio.app.masterdata.service.model.entity.Producto;
import com.dca.sio.app.masterdata.service.model.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private IProductService productService;


    @GetMapping("/productos")
    public List<Producto> listarProductos(){
        return productService.findAllProducts();
    }

    @GetMapping("/verproducto/{codProducto}")
    public Producto listarProducto(@PathVariable String codProducto) throws Exception{
        return productService.findByCodProducto(codProducto);
    }

    @GetMapping("/producto/{descripcion}")
    public Producto getProducto(@PathVariable String descripcion) throws Exception{
        return productService.findByDescripcion(descripcion);
    }

    @PostMapping("/createProducto")
    @ResponseStatus(HttpStatus.CREATED)
    public Producto createProduct(Producto producto){
        return productService.createProduct(producto);
    }

    @PutMapping("/editProducto/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Producto editProduct(@PathVariable Long id, @RequestBody Producto producto) throws Exception {
        return productService.editProduct(id, producto);
    }

    @DeleteMapping("/deleteProducto/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
    }

}

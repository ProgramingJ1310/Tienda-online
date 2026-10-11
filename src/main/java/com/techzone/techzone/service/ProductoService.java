
package com.techzone.techzone.service;

import com.techzone.techzone.model.Producto;
import com.techzone.techzone.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }
    public Producto guardarProducto(Producto producto){
        return productoRepository.save(producto);
    }
}

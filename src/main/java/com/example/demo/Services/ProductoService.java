package com.example.demo.Services;

import com.example.demo.Models.Producto;
import com.example.demo.Repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;


    //obtiene tddos los products verdaderos (est=true)+
    public List<Producto> traeProductos() { //trae todos los pruduct de la BD
    return productoRepository.findByEstadoTrue();
    }


    public Producto traeProductoPorId (Integer id) {
        if (id == null) {
            throw new IllegalArgumentException("El ID no puede ser nulo");//trae un product por ID(busca el id)
        }
        return productoRepository.findById(id).orElse(null);
    }

    //crea un nuevo producto
    public void crearProducto (Producto producto){
    if (producto == null) {
        throw new IllegalArgumentException ("El producto no puede ser nulo, no puede estar vacio");
    }
    productoRepository.save (producto);
    }
    
    //actualizar producto
    public void actualizarProducto(Producto producto) {
        if (producto == null || producto.getId () == null){
            throw new IllegalArgumentException (" el producto o id no puede ser null");
        }
        if (!productoRepository.existsById(producto.getId())) {
            throw new IllegalArgumentException("producto con id " + producto.getId() + "no encontrado");
        }
        productoRepository.save(producto);
    }


    //eliminar producto(actualizar el estado a false o esconder)
    public Producto eliminarProducto (Integer id) {
        if(id == null) {
            throw new IllegalArgumentException("El id no puede ser null");
        }
        Producto producto = productoRepository.findById(id).orElse(null);
        if (producto != null) {
            producto.setEstado(false);
            return productoRepository.save(producto);
        }
        return null;

    }
    


    }







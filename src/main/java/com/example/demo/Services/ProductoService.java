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






}

package com.example.demo.Repository;

import com.example.demo.Models.Producto; //llama hace el crud del model Product
import org.springframework.data.jpa.repository.JpaRepository; //llama a la librari para hacer la conexion de java y mysql
import java.util.List;

//integer por el ID
public interface ProductoRepository extends JpaRepository <Producto, Integer> {
//busca productos activos
List<com.example.demo.Models.Producto> findByEstadoTrue();
    
}     


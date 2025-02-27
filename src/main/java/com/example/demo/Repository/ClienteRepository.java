package com.example.demo.Repository;

import com.example.demo.Models.Cliente; //llama hace el crud del model Client
import org.springframework.data.jpa.repository.JpaRepository; //llama a la librari para hacer la conexion de java y mysql
import java.util.List;

//integer por el ID
public interface ClienteRepository extends JpaRepository <Cliente, Integer> {
//busca productos activos
List<com.example.demo.Models.Cliente> findByEstadoTrue();
    
}     


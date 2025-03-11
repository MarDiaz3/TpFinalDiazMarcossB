package com.example.demo.Services;

import com.example.demo.Models.Cliente;
import com.example.demo.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service

public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;


    //obtiene tddos los products verdaderos (est=true)+
    public List<Cliente> traeCliente() { //trae todos los pruduct de la BD
    return clienteRepository.findByEstadoTrue();
    }


    public Cliente traeClientePorId (Integer id) {
        if (id == null) {
            throw new IllegalArgumentException("El ID no puede ser nulo");//trae un product por ID(busca el id)
        }
        return clienteRepository.findById(id).orElse(null);
    }


       //crea un nuevo cliente
    public void crearCliente(Cliente cliente){
    if (cliente == null) {
        throw new IllegalArgumentException ("El cliente no puede ser nulo, no puede estar vacio");
    }
    clienteRepository.save (cliente);
    }


    //actualizar cliente
    public void actualizarCliente(Cliente cliente) {
        if (cliente == null || cliente.getId () == null){
            throw new IllegalArgumentException (" el cliente o id no puede ser null");
        }
        if (!clienteRepository.existsById(cliente.getId())) {
            throw new IllegalArgumentException("producto con id " + cliente.getId() + "no encontrado");
        }
        clienteRepository.save(cliente);
    }


    
    //eliminar cliente (actualizar el estado a false o esconder)
    public Cliente eliminarCliente (Integer id) {
        if(id == null) {
            throw new IllegalArgumentException("El id no puede ser null");
        }
        Cliente cliente = clienteRepository.findById(id).orElse(null);
        if (cliente != null) {
            cliente.setEstado(false);
            return clienteRepository.save(cliente);
        }
        return null;

    }
    










}





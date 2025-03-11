package com.example.demo.Models;

import jakarta.persistence.*;

@Entity
public class Compra {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;

@ManyToOne
@JoinColumn(name = "id_cliente", nullable = false)
private Cliente cliente;

@ManyToOne
@JoinColumn (name = "id_producto", nullable = false)
private Producto producto;

//getters y setters

public Integer getId () {
    return id;
}
public void setId (Integer id){
    this.id = id;
}


public Cliente getCliente () {
    return cliente;
}
public void setCliente (Cliente cliente){
    this.cliente = cliente;
}


public Producto getProducto () {
    return producto;
}
public void setProducto (Producto producto){
    this.producto = producto;
}


}

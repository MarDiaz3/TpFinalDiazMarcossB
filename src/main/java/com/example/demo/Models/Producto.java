package com.example.demo.Models;


import jakarta.persistence.*;
import java.time.LocalDate;



//model class
@Entity
public class Producto {//creo tabla de mysql
    @id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    @column
    private String nombre;

    @column
    private String marca;

    @column
    private String categoriaDeProduct;
    
    @column
    private String descripProduct;

    @column
    private double precioProduct;

    @column
    private String reseñaProduct;

    @column
    private double pesoDelProdut;

    @column
    private Integer fechaDeVencimient;

    @column
    private boolean estado = true;


//constructorVacio
public Producto()  {

}
//constructoresParametros
public Producto (Integer id,String nombre,String marca,String categoriaDeProduct,String descripProduct,double precioProdut,String reseñaProduct,double pesoDelProdut, Integer fechaDeVencimient,boolean estado){

this.id = id;
this.nombre = nombre;
this.marca = marca;
this.categoriaDeProduct = categoriaDeProduct;
this.descripProduct = descripProduct;
this.pesoDelProdut = precioProdut;
this.reseñaProduct = reseñaProduct;
this.pesoDelProdut = pesoDelProdut;
this.fechaDeVencimient = fechaDeVencimient;
this.estado = estado;
}


//getters.setters
public Integer getId(){
    return id;
}
public void setId(Integer id){
this.id = id; 
}
public String getNombre(){
    return nombre;
}
public void setNombre(String nombre){
this.nombre = nombre;
}

public String getMarca(){
    return marca;
}
public void setMarca(String marca){
this.marca = marca; 
}

public String getCategoriaDeProduct(){
    return categoriaDeProduct;
}
public void setCategoriaDeProduct(String categoriaDeProduct){
this.categoriaDeProduct = categoriaDeProduct; 
}

public String getDescripProduct(){
    return descripProduct;
}
public void setDescripProduct(String descripProduct){
this.descripProduct = descripProduct; 
}

public double getPrecioProduct(){
    return precioProduct;
}
public void setPrecioProduct(double precioProduct){
this.precioProduct = precioProduct;}

public String getReseñaProduct(){
    return reseñaProduct;
}
public void setReseñaProduct(String reseñaProduct){
this.reseñaProduct = reseñaProduct;}

public double getPesoDelProdut(){
    return pesoDelProdut;
}
public void setPesoDelProdut(double pesoDelProdut){
this.pesoDelProdut = pesoDelProdut;
}

public Integer getFechaDeVencimient(){
    return fechaDeVencimient;
}
public void setFechaDeVencimient(Integer fechaDeVencimient){
this.fechaDeVencimient = fechaDeVencimient;


}
public boolean getEstado(){
    return estado;
}
public void setEstado(boolean estado){
this.estado = estado;
}
}

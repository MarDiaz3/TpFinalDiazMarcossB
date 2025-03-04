package com.example.demo.Models;


import jakarta.persistence.*;


public class Cliente {
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column
    private Integer id;

    @Column
    private Integer dni;

    @Column
    private String nombreApellidos;

    @Column
    private Integer edad;

    @Column
    private String formDePago;

    @Column
    private Integer numDeClient;

    @Column
    private double pagoDelProduct;

    @Column
    private String correoClient;

    @Column ()
    private boolean estado = true;
  

    //constructorVacio
    public Cliente ()  {

    }
    //constructorParametros
    public Cliente (Integer id,Integer dni,String nombreApellidos,Integer edad,String formDePago,Integer numDeClient,double pagoDelProduct,String correoClient,boolean estado){
        this.id = id;
        this.dni = dni;
        this.nombreApellidos = nombreApellidos;
        this.edad = edad;
        this.formDePago = formDePago;
        this.numDeClient = numDeClient;
        this.pagoDelProduct = pagoDelProduct;
        this.correoClient = correoClient;
        this.estado = estado;
    }
   
    //getters setters
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
    this.id = id; 
    }
    
    public Integer getDni(){
        return dni;
    }
    public void setDni(Integer dni){
    this.dni = dni; 
    }
    public String getNombreApellidos(){
        return nombreApellidos;
    }
    public void setNombreApellidos(String nombreApellidos){
    this.nombreApellidos = nombreApellidos; 
    }
    public Integer getEdad(){
        return edad;
    }
    public void setEdad(Integer edad){
    this.edad = edad; 
    }


    public String getFormDePago(){
        return formDePago;
    }
    public void setFormDePago(String formDePago){
    this.formDePago = formDePago; 
    }

    public Integer getNumDeClient(){
        return numDeClient;
    }
    public void setNumDeClient(Integer numDeClient){
    this.numDeClient = numDeClient; 
    }
    public double getPagoDelProduct(){
        return pagoDelProduct;
    }
    public void setPagoDelProduct(double pagoDelProduct){
    this.pagoDelProduct = pagoDelProduct; 
    }
    public String getCorreoClient(){
        return correoClient;
    }
    public void setCorreoClient(String correoClient){
    this.correoClient = correoClient; 
    }
    public boolean getEstado(){
        return estado;
    }
    public void setEstado(Boolean estado){
    this.estado = estado; 
    }

}

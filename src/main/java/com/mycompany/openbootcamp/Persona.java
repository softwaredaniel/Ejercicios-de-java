/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.openbootcamp;

/**
 *
 * @author DANIEL
 */
public class Persona {
    private String nombre;
    private int edad;
    private int telefono;
    
     public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public void setTelefono( int telefono){
        this.telefono=telefono;
    }
    public int getTelefono(){
        return telefono;
    }
    
}

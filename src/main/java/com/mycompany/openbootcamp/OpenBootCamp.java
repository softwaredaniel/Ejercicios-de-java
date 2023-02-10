/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.openbootcamp;

/**
 *
 * @author DANIEL
 */
public class OpenBootCamp {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Persona persona=new Persona();
        persona.setNombre("Alex");
        System.out.println(persona.getNombre());
        persona.setEdad(18);
        System.out.println(persona.getEdad());
        persona.setTelefono(318);
        System.out.println(persona.getTelefono());
        int a=10;
        int b=20;
        int c=30;
        var valor =suma(a,b,c);
         System.out.println(valor);
       Coche miCoche=new Coche();
       miCoche.aumentarPuertas();
       System.out.println(miCoche.puertas);
    }
    
    
    public  static int suma(int a,int b, int c){
      
          return a+b+c;
    }
}

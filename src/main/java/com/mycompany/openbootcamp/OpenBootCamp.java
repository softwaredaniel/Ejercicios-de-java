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

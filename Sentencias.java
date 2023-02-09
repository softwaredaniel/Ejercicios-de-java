public class MyClass {
    public static void main(String args[]) {
        int numeroIf=8;
        if (numeroIf<0){
           System.out.println("El numero es negativo");
       }else{
             System.out.println("El numero es positivo");
           
    }
        int numeroWhile=1;
        while(numeroWhile<3){
          numeroWhile++;
          System.out.println("Entro al bucle while");
        } 
        do{ 
          numeroWhile++;
          System.out.println("Entro al bucle while");
          }
        while(numeroWhile<3);
        for(int numeroFor=0;numeroFor<=3;numeroFor=numeroFor+1)
        {
            System.out.println("El numero for es"+numeroFor);
        }
        
         String estacion="Primavera";
      
      switch(estacion){
          case "Invierno":
              System.out.println("Estas en invierno");
              break;
          case "Verano":
               System.out.println("Estas en Verano");
               break;
          case "Primavera":
               System.out.println("Estas en Primavera");
               break;
          case "Otoño":
               System.out.println("Estas en Otoño");
               break;
          default:
               System.out.println("No existe estacion");
              
      }
        
    }
    
 
}

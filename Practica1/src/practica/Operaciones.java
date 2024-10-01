package practica;

import java.util.Scanner;

public class Operaciones {
    
    int opcion;
    int nro1;
    int nro2;
    Scanner entrada = new Scanner(System.in);
    
    public void pedirNros(){
        System.out.print("Ingrese primer nro: ");
        nro1= entrada.nextInt();
        System.out.println("");
        System.out.print("Ingrese segundo nro: ");
        nro2= entrada.nextInt();  
                
        mostrarMenu();
    }
       
    public void mostrarMenu(){
        System.out.println("");
        System.out.println("Selecciona una opción : ");
        System.out.println("");
        System.out.println("1) Sumar");
        System.out.println("2) Restar");
        System.out.println("3) Multiplicar");
        System.out.println("");
        opcion = entrada.nextInt();
        
        switch(opcion){
            
            case 1 :
                sumar();
                break;
            case 2 :
                restar();
                break;
            case 3 :
                multiplicar();
                break;
            default:
                System.out.println("La opción ingresada no es valida");                   
        
        }        
    }
    
    public void sumar(){
        int resultado= nro1+nro2;
        System.out.println("");
        System.out.println("La suma de "+nro1+" y "+nro2+" es: "+ resultado);
    }
    
    public void restar(){
        int resultado= nro1-nro2;
        System.out.println("");
         System.out.println("La resta de "+nro1+" y "+nro2+" es: "+ resultado);
    }
    
    public void multiplicar(){
        int resultado= nro1*nro2;
        System.out.println("");
         System.out.println("La multiplicación de "+nro1+" y "+nro2+" es: "+ resultado);
    }
    
    
    
}

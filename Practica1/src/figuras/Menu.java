package figuras;

import java.util.Scanner;

public class Menu {
    
    int opcionOp;
    Scanner entrada = new Scanner(System.in);
   
    public int MostrarMenu(){
        
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("---- SELECCIONE UNA OPERACIÓN ----");
            System.out.println("1) Calcular Area");
            System.out.println("2) Calcular Perimetro");
            System.out.println("3) Salir");
            System.out.println("");
            
            System.out.print("Ingrese Opcion: ");
            
            opcionOp = entrada.nextInt();
            
            return opcionOp;
    }
}

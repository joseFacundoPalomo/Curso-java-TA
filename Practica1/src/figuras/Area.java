package figuras;

import java.util.Scanner;

public class Area {
    
    Scanner entrada = new Scanner(System.in);
    
    public void calcularArea(int op){
        
        if(op == 1){
            int lado;
            int resultado;
                 
            System.out.print("Ingresa valor lado cuadrado: ");
            lado = entrada.nextInt();
            resultado = lado*lado;
            
            System.out.println("");
            System.out.println("**************************************");
            System.out.println("El area del Cuadrado es: "+resultado );
            System.out.println("**************************************");
            System.out.println("");
        }
        
        else if(op == 2){
            int altura;
            int base;
            int resultado;
            
            System.out.print("Ingresa valor base triangulo: ");
            base = entrada.nextInt();
            System.out.println("");
            System.out.print("Ingresa valor altura triangulo: ");
            altura = entrada.nextInt();
            
            resultado = (base*altura)/2;
            
            System.out.println("");
            System.out.println("**************************************");
            System.out.println("El area del Triangulo es: "+resultado );
            System.out.println("**************************************");
            System.out.println("");
            
        }
        
        else{
            
            double radio;
            double resultado;
            
            System.out.print("Ingresa valor radio Circulo: ");
            radio = entrada.nextDouble();
            System.out.println("");        
            
            resultado =  Math.PI * Math.pow(radio, 2);
            
            System.out.println("");
            System.out.println("**************************************");
            System.out.println("El area del Circulo es: "+resultado );
            System.out.println("**************************************");
            System.out.println("");
        }
        
    
    }
}

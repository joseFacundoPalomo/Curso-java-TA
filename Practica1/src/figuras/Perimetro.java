package figuras;

import java.util.Scanner;

public class Perimetro {
    public void calcularPerimetro(int op){
        Scanner entrada = new Scanner(System.in);
        
        
        
        if(op == 1){
            int lado;
            int resultado;
            System.out.print("Ingresa valor lado cuadrado:");
            lado= entrada.nextInt();
            resultado= 4*lado;
            
            System.out.println("El perimetro del cuadrado es: "+resultado);
        }       
        else if(op == 2){
            int lado;
            int lado2;
            int lado3;
            int resultado;
            
            System.out.print("Ingrese valor lado triangulo: ");
            lado= entrada.nextInt();
            System.out.println("");
            System.out.print("Ingrese valor lado 2 triangulo: ");
            lado2= entrada.nextInt();
            System.out.println("");
            System.out.print("Ingrese valor lado 2 triangulo: ");
            lado3= entrada.nextInt();
            resultado= lado+lado2+lado3;
            System.out.println("");
            System.out.println("El perimetro del triangulo es: "+resultado);
        }
        else{
            double r;
            int radio;
            System.out.print("Ingrese valor radio circulo: ");
            radio= entrada.nextInt();
            r= 2*Math.PI*radio;
            
            System.out.println("El perimetro del circulo es: "+r);
        }
    }
}

package figuras;

import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcionOp;
        int opcionFig;
        
        Menu menu = new Menu();
        Area area = new Area();
        Perimetro perimetro = new Perimetro();
        
        do{
            
            opcionOp= menu.MostrarMenu();
            
            
            switch(opcionOp){
                case 1 :
                    System.out.println("");
                    System.out.println("---- SELECCIONE UNA FIGURA ----");
                    System.out.println("1) Cuadrado");
                    System.out.println("2) Triangulo");
                    System.out.println("3) Circulo");
                    System.out.println("");
                    System.out.print("Ingrese Opcion: ");                    
                    opcionFig= entrada.nextInt();
                    System.out.println("");
                        
                        switch(opcionFig){
                            case 1:
                                System.out.println("");
                                area.calcularArea(opcionFig);
                                System.out.println("");
                                break;
                            case 2:
                                System.out.println("");
                                area.calcularArea(opcionFig);
                                System.out.println("");
                                break;
                            case 3:
                                System.out.println("");
                                area.calcularArea(opcionFig);
                                System.out.println("");
                                break;
                            default:
                                break;
                        }  
                    break;
                case 2 :
                    System.out.println("");
                    System.out.println("---- SELECCIONE UNA FIGURA ----");
                    System.out.println("1) Cuadrado");
                    System.out.println("2) Triangulo");
                    System.out.println("3) Circulo");
                    System.out.println("");
                    System.out.print("Ingrese Opcion: ");                    
                    opcionFig= entrada.nextInt();
                    System.out.println("");
                        
                        switch(opcionFig){
                            case 1:
                                System.out.println("");
                                perimetro.calcularPerimetro(opcionFig);
                                System.out.println("");
                                break;
                            case 2:
                                System.out.println("");
                                perimetro.calcularPerimetro(opcionFig);
                                System.out.println("");
                                break;
                            case 3:
                                System.out.println("");
                                perimetro.calcularPerimetro(opcionFig);
                                System.out.println("");
                                break;
                        }
                            
                case 3:
                    break;
                default:
                    System.out.println("");
                    System.out.println("La opción elegida no es valida");
                    System.out.println("");
                    break;
            }
            
                
        }while(opcionOp != 3);
        
        
        
    }
    
}

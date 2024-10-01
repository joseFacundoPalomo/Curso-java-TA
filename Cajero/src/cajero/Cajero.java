package cajero;
import javax.swing.JOptionPane;

public class Cajero {
    public int saldo = 900000;
    public String clave = "Hola mundo";
    
    public void mostrarMenu(){
        int opcion = 0;
        do{            
         String cadena = JOptionPane.showInputDialog(null,""
                 +"1. Consultar saldo\n"
                 +"2. Depositar\n"
                 +"3. Retirar\n"
                 +"4. Cambiar clave\n"
                 +"5. Salir");
         
         if(cadena != null && ValidacionNumero.isNum(cadena)){
             opcion = Integer.parseInt(cadena); 
             
             switch(opcion){
                 case 1:
                     verSaldo();
                     break;
                 case 2:
                     depositar();
                     break;
                 case 3:
                     retirar();
                     break;
                 case 4:
                     
                     break;
                 case 5:
                     salir();
                     break;
                 default:
                     JOptionPane.showMessageDialog(null,""
                     +"La opcion no esta diponible");
                     break;
             }
         }
         
        }while(opcion != 5);
    }
    
    
    public void verSaldo(){    
        JOptionPane.showMessageDialog(null,""
        +"Tu saldo es: " + saldo);
    }
        
    public void depositar(){
        String cadena;
        int deposito;
        
        cadena = JOptionPane.showInputDialog(null,""
        +"Ingrese el monto a depositar");
        
        if(cadena != null && cadena != "" && ValidacionNumero.isNum(cadena) && cadena != "0" ){
           deposito = Integer.parseInt(cadena);
           saldo = saldo + deposito;
        }
        else{
            JOptionPane.showMessageDialog(null,""
        +"El monto es incorrecto");
        }        
    }
    
    public void retirar(){
        String cadena;
        int retiro;
        
        cadena= JOptionPane.showInputDialog(null,""
        +"Ingrese el monto a retirar"
        );
        
        if( cadena != null && cadena != "" & ValidacionNumero.isNum(cadena) ){
            retiro= Integer.parseInt(cadena);
        }
        
        else{
            JOptionPane.showMessageDialog(null, ""
            +"El monto ingresado es incorrecto"
            );
        }
        
    }
    
    public void cambiarClave(){
        String cadena;
        String nuevaClave;
        
        cadena= JOptionPane.showInputDialog(null,""
        + "Ingrese clave actual"
        );
        
        if(cadena != null && cadena != "" && cadena == clave){
            nuevaClave = cadena;
        }
        else{
            JOptionPane.showMessageDialog(null, ""
            +"La clave es incorrecta"
            );
        }
        
    }
    
    public void salir(){
        JOptionPane.showMessageDialog(null,""
        +"Muchas gracias por participar");
    }    
    
}


 
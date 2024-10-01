package practica2;

public class Edad {
    public void comprobarEdad( String nombre,int edad){
       
        if( edad > 18 ){
            System.out.println(nombre+" tiene "+edad+" y es mayor de edad");
        }
        else{
            System.out.println(nombre+" tiene "+edad+" y es menor de edad");
        }
    }
}

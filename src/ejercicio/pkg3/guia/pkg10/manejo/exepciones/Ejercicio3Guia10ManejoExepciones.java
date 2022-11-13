
package ejercicio.pkg3.guia.pkg10.manejo.exepciones;

import java.util.Scanner;

public class Ejercicio3Guia10ManejoExepciones {

    
    public static void main(String[] args) {

        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        String num1=leer.nextLine();
        System.out.println("ingrese el segundo numero");
        String num2=leer.nextLine();
        int num1n= Integer.parseInt(num1);
        int num2n= Integer.parseInt(num2);
        
        try{
            System.out.println("el resultado de la division de los dos numeros es "+(num1n/num2n));
        }
        catch(Exception a){
            System.out.println("no se puede dar el resultado de la division entre esos dos numeros "+a.getMessage());
        }
    }
    
}
/*Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.*/
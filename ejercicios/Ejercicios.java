package ejercicios;

import java.util.Scanner;
        
public class Ejercicios {

    
    public static void main(String[] args) {
        System.out.println("Hola Mundo");  
        
        //objeto lector por consola
        Scanner lector= new Scanner(System.in);
        int num1,num2;
        num1=lector.nextInt();
        num2=lector.nextInt();
        int resultado=num1+num2;
        System.out.println("El resultado es"+ resultado);
        
    }
    
}


package model;

import java.util.HashSet;
import java.util.Set;

public class Ejemplo10 {
    public static void main(String[] args) {
      String alumno1 = "Luis miguel";
      String alumno2 = "bebito fiu fiu";
      String alumno3 = "castolo";
      String alumno4 = "raton perez";
      String alumno5 = "perico palotes";
      String alumno6 = "reflujo";
      
      
        Set<String> listaAlumnos = new HashSet<>();
        
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);
        
        //con un for para mostrar la lista
        for (String alumno: listaAlumnos){
            System.out.println(alumno);
        }
        
        
        boolean valida = listaAlumnos.contains("raton perez");
        System.out.println(valida);
        
        
        //borrar un objeto (alumno) de la lista 
        listaAlumnos.removeIf(alumno -> "castolo".equalsIgnoreCase(alumno));
        
        //mostrar lista con lambda y foreach
        listaAlumnos.forEach(alumno -> {
            System.out.println(alumno);
        });
        
        System.out.println(listaAlumnos.stream().filter(alumno -> alumno.equalsIgnoreCase("Gustavo Polar")).findFirst().orElse("No Existe"));
      
    }
}  

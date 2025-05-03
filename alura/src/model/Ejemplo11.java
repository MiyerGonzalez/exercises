
package model;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Ejemplo11 {
    public static void main(String[] args) {
      Alumno alumno1 = new Alumno("Luis miguel", "001") ;
      Alumno alumno2 = new Alumno("bebito fiufiu", "002");
      Alumno alumno3 = new Alumno("castolo", "003");
      Alumno alumno4 = new Alumno("raton perez", "004");
      Alumno alumno5 = new Alumno("perico palotes", "005");
      Alumno alumno6 = new Alumno("reflujo", "006");
      
        Collection<Alumno> listaAlumnos = new HashSet<>();
        
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);
        Alumno alumnoNuevo = new Alumno("Luis miguel", "001");
        //System.out.println(listaAlumnos.contains(alumno1));
      System.out.println(alumno1.equals(alumnoNuevo));
      System.out.println(listaAlumnos.contains(alumnoNuevo));
      
    }
}

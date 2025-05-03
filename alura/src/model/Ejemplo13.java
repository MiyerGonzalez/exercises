package model;
import java.util.*;



public class Ejemplo13 {
    public static void main(String[] args) {
      
      Curso curso1 = new Curso ("Historia", 30);
      
      Alumno alumno1 = new Alumno("Luis miguel", "001") ;
      Alumno alumno2 = new Alumno("bebito fiufiu", "002");
      Alumno alumno3 = new Alumno("castolo", "003");
      Alumno alumno4 = new Alumno("raton perez", "004");
      Alumno alumno5 = new Alumno("perico palotes", "005");
      Alumno alumno6 = new Alumno("reflujo", "006");
      
        Collection<Alumno> listaAlumnos = new HashSet<>();
        
        curso1.addAlumno(alumno1);
        curso1.addAlumno(alumno2);
        curso1.addAlumno(alumno3);
        curso1.addAlumno(alumno4);
        curso1.addAlumno(alumno5);
        curso1.addAlumno(alumno6);
        
        //curso1.getAlumnos().forEach(alumno -> System.out.println(alumno));
        
        Iterator<Alumno> alumnoIterator = curso1.getAlumnos().iterator();
        while (alumnoIterator.hasNext()){
            System.out.println(alumnoIterator.next());
        }
        
    }
}

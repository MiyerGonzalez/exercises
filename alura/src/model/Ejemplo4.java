
package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Ejemplo4 {
    public static void main(String[] args) {
      Curso curso1 = new Curso("RUBI", 30) ;
      Curso curso2 = new Curso("PHP", 10) ;
      Curso curso3 = new Curso("JAVASCRIPT", 20) ;
      Curso curso4 = new Curso("JAVA", 50) ;
     
      
      ArrayList<Curso> cursos = new ArrayList<>();
      cursos.add(curso1);
      cursos.add(curso2);
      cursos.add(curso3);
      cursos.add(curso4);
      
      System.out.println(cursos);
      //Collections.sort(cursos);
      //System.out.println(cursos);
      
      //Collections.sort(cursos, Collections.reverseOrder());
      //System.out.println(cursos);
      
      //Quitar un elemento de la lista (PHP) usando lambda
      List<Curso> cursoList = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("PHP")).sorted(Comparator.comparing(Curso::getNombre).reversed()).collect(Collectors.toList());
      System.out.println(cursoList);
      
        
    } 
}

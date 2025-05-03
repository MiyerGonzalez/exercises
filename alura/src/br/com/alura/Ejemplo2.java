package br.com.alura;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ejemplo2 {

    public static void main(String[] args) {
      String curso1 = "Geometria";
      String curso2 = "Fisica";
      String curso3 = "quimica";
      String curso4 = "historia";
      
      ArrayList<String> cursos = new ArrayList<>();
      cursos.add(curso1);
      cursos.add(curso2);
      cursos.add(curso3);
      cursos.add(curso4);
      
      //System.out.println(cursos);
      //con sort se ordena la lista de forma alfabetica
      //ordenar con collections
        //Collections.sort(cursos);
        //System.out.println(cursos);
      //invertir el orden 
        //Collections.sort(cursos, Collections.reverseOrder());
        //System.out.println(cursos);
      //ordenar con Comparator
        //cursos.sort(Comparator.naturalOrder());
        //System.out.println(cursos);
      //ordenar con stream()
        List<String> cursosList = cursos.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(cursosList);
        
        
       }
         
    }

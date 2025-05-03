package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Ejemplo9 {
    public static void main(String[] args) {
      Curso curso1 = new Curso("Historia", 30) ;
      Curso curso2 = new Curso("Algebra", 10) ;
      Curso curso3 = new Curso("Aritmetica", 20) ;
      Curso curso4 = new Curso("Geometria", 50) ;
      Curso curso5 = new Curso("Fisica", 60) ;
      Curso curso6 = new Curso("quimica", 80) ;
      Curso curso7 = new Curso("quimica", 70) ;
      Curso curso8 = new Curso("Fisica", 30) ;
     
      ArrayList<Curso> cursos = new ArrayList<>();
      cursos.add(curso1);
      cursos.add(curso2);
      cursos.add(curso3);
      cursos.add(curso4);
      cursos.add(curso5);
      cursos.add(curso6);
      cursos.add(curso7);
      cursos.add(curso8);
      
      System.out.println(cursos);
      
      
      
      List<Curso> cursoList = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("PHP")).sorted(Comparator.comparing(Curso::getNombre).reversed()).collect(Collectors.toList());
      
      System.out.println(cursos.stream().mapToInt(Curso::getTiempo).sum());
      System.out.println(cursos.stream().mapToInt(Curso::getTiempo).average().getAsDouble());
      System.out.println(cursos.stream().mapToInt(Curso::getTiempo).max().getAsInt());
      System.out.println(cursos.stream().mapToInt(Curso::getTiempo).min().getAsInt());
      Map<String, List<Curso>> groupCurso = cursos.stream().collect(Collectors.groupingBy(Curso::getNombre));
      
      groupCurso.forEach((key, value) -> System.out.println(key+ "-"+value.size()));
      
      System.out.println(cursos.parallelStream().mapToInt(Curso::getTiempo).sum());
    } 
}

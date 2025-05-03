
package model;

import java.util.*;


public class Curso implements Comparable<Curso> {
    
    private String nombre;
    private int tiempo;
    private List<Aula> claseList = new ArrayList<>();
    private Collection<Alumno> alumnos = new HashSet<>();
    //private Collection<Alumno> alumnos = new LinkedHashSet<>();
    //private Map<String, Alumno> alumnomap = new HashMap<>();
    private Map<String, Alumno> alumnomap = new LinkedHashMap<>();

    
     public Curso(String nombre, int tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
    }
    
    public Curso(String nombre, int tiempo, List<Aula> claseList) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.claseList = claseList;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public List<Aula> getAulaList() {
        return Collections.unmodifiableList(claseList);
    }

    public void setAulaList(List<Aula> claseList) {
        this.claseList = claseList;
    }
    
    public void addAula(Aula clase){
        this.claseList.add(clase);
    }
    
    public void addAlumno(Alumno alumno){
        this.alumnos.add(alumno); this.alumnomap.put(alumno.getCodigo(), alumno);
    }
    
    public boolean verificaAlumno(Alumno alumno){
        return this.alumnos.contains(alumno);
    }

    public Collection<Alumno> getAlumnos() {
        return alumnos;
    }

    public Map<String, Alumno> getAlumnomap() {
        return alumnomap;
    }
    
    
    
    
    
    @Override
    public String toString(){
        return this.nombre;
    }

    @Override
    public int compareTo(Curso o) {
        return this.nombre.compareTo(o.getNombre());
    }
    
    
    
}

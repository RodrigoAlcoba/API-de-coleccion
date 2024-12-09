package set;

import modelo.Alumno;

import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {

        Set<Alumno> alumnos = new TreeSet<>();
        alumnos.add(new Alumno("Alumno1", 10));
        alumnos.add(new Alumno("Alumno2", 20));
        alumnos.add(new Alumno("Alumno3", 30));
        alumnos.add(new Alumno("Alumno4", 40));
    }
}

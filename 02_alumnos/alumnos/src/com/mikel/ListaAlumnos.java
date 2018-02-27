package com.mikel;

import java.util.ArrayList;
import java.util.List;

public class ListaAlumnos {

    private List<Alumno> alumnos=new ArrayList<>();

    public void añadirAlumno(Alumno a){

        alumnos.add(a);
    }
    public List<Alumno> obtenerListaAlumnos(){
        return alumnos;
    }
}

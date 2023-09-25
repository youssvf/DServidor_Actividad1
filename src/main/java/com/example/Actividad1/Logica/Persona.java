package com.example.Actividad1.Logica;

import java.util.ArrayList;

public class Persona {
    public String nombre;
    public int edad;
    public ArrayList<String> intereses;

    public Persona(String nombre, int edad, ArrayList<String> intereses) {
        this.nombre = nombre;
        this.edad = edad;
        this.intereses = intereses;
    }
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.intereses = new ArrayList<>();

    }

    public ArrayList<String> getIntereses() {
        return intereses;
    }

    public void setIntereses(ArrayList<String> intereses) {
        this.intereses = intereses;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

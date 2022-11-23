package org.example;

public class Accesorio {
    private String nombre;

    public Accesorio(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Accesorio{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

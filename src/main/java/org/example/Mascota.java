package org.example;

import java.util.ArrayList;
import java.util.List;

public class Mascota {
    private String nombre;
    private String edad;

    private List<Accesorio> accesorios;

    public Mascota(String nombre, String edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.accesorios = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' +
                '}';
    }
    public void agregarAccesorio(Accesorio accesorio){
        accesorios.add(accesorio);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public List<Accesorio> getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(List<Accesorio> accesorios) {
        this.accesorios = accesorios;
    }
}

package org.example;

public class Perro extends Mascota implements Animal{
    public Perro(String nombre, String edad) {
        super(nombre, edad);
    }

    @Override
    public String haceSonido() {
        return "Guao";
    }

}

package org.example;

public class Gato extends Mascota implements Animal{
    public Gato(String nombre, String edad) {
        super(nombre, edad);
    }

    @Override
    public String haceSonido() {
        return "Miau";
    }
}

package org.example;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Accesorio accesorio1 = new Accesorio("Collar");

        Gato gato1 = new Gato("Tom","5");
        Gato gato2 = new Gato("Mini","4");

        Perro perro1 = new Perro("Campeon","3");
        Perro perro2 = new Perro("Leal","8");

        perro1.agregarAccesorio(accesorio1);

        System.out.println("Mi mascota "+gato1.getNombre()+ " tiene "+gato1.getEdad()+ " years y hace "+gato1.haceSonido());
        System.out.println("Mi mascota "+gato2.getNombre()+ " tiene "+gato2.getEdad()+ " years y hace "+gato2.haceSonido());
        System.out.println("Mi mascota "+perro1.getNombre()+ " tiene "+perro1.getEdad()+ " years y hace " +
                ""+perro1.haceSonido()+" su accesorio es un "+ perro1.getAccesorios());
        System.out.println("Mi mascota "+perro2.getNombre()+ " tiene "+perro2.getEdad()+ " years y hace "+perro2.haceSonido());

    }
}
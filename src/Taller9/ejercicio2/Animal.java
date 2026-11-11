package taller09.ejercicio02;

public class Animal {
    protected String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    public void mostrarEspecie() {
        System.out.println("Especie: " + especie);
    }

    public static void main(String[] args) {
        Perro perro = new Perro("Canino (Canis lupus familiaris)", "Golden Retriever");
        perro.mostrarEspecie();
    }
}


class Perro extends Animal {
    private String raza;

    public Perro(String especie, String raza) {
        super(especie);
        this.raza = raza;
    }

    @Override
    public void mostrarEspecie() {
        super.mostrarEspecie();
        System.out.println("Raza: " + raza);
    }
}

    @Override
    public void mostrarEspecie() {
        super.mostrarEspecie();
        System.out.println("Tipo de agua: " + tipoDeAgua);
    }
}
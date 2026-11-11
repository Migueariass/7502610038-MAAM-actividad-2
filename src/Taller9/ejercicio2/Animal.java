package taller09.ejercicio02;


public class Animal {
    protected String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    public void mostrarEspecie() {
        System.out.println("Especie: " + especie);
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


    public static void main(String[] args) {
        Perro miPerro = new Perro("Canino (Canis lupus familiaris)", "Boston Terrier");
        miPerro.mostrarEspecie();
    }
}
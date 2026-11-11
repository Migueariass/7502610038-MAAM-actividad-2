package taller09.ejercicio03;

class Vehiculo {
    private String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }
}

public class Auto extends Vehiculo {

    public Auto(String marca) {
        super(marca);
    }

    public void mostrarMarca() {
        System.out.println("Marca del vehículo: " + super.getMarca());
    }

    public static void main(String[] args) {
        Auto miAuto = new Auto("Mazda");
        miAuto.mostrarMarca();
    }
}
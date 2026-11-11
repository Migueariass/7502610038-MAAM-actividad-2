package taller10.ejercicio02;

class Vehiculo {
    public void moverse() {
        System.out.println("El vehículo se está desplazando.");
    }
}

public class Bicicleta extends Vehiculo {
    private String tipo;

    public Bicicleta(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void moverse() {
        System.out.println("La bicicleta de " + tipo + " se desplaza pedaleando por la ciclovía.");
    }

    public static void main(String[] args) {
        Vehiculo vehiculoGenerico = new Vehiculo();
        Bicicleta miBicicleta = new Bicicleta("Montaña");

        System.out.println("--- Prueba de Sobrescritura de Métodos ---");
        vehiculoGenerico.moverse();
        miBicicleta.moverse();
    }
}
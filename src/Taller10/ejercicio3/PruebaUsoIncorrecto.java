package taller10.ejercicio03;

// Clase base para demostrar errores
class VehiculoBase {
    public void acelerar(int velocidad) {
        System.out.println("Acelerando a " + velocidad + " km/h.");
    }

    public void frenar() {
        System.out.println("El vehículo está frenando.");
    }
}

public class PruebaUsoIncorrecto extends VehiculoBase {

    /*
     * CASO 1: ERROR DE COMPILACIÓN (Comentado para poder compilar y ejecutar)
     * Si descomentas las siguientes 3 líneas con @Override, Java nos va a lanza un Error de Compilación
     * porque cambiar los parámetros altera la firma del método (eso seria Sobrecarga, no sobrescritura)
     *

     *
     * CASO 2: MALA PRÁCTICA SIN ERROR DE COMPILACIÓN
     * Sobrescribir el método frenar() omitiendo la anotación @Override.
     * Compila y funciona, pero es propenso a errores silenciosos si la clase base cambia.
     */
    public void frenar() {
        System.out.println("Frenado de emergencia activado (Sin usar la anotación @Override).");
    }

    public static void main(String[] args) {
        PruebaUsoIncorrecto prueba = new PruebaUsoIncorrecto();

        System.out.println("--- Análisis de Uso Incorrecto ---");
        prueba.acelerar(80); // Llama al método de la clase base
        prueba.frenar();     // Llama al método sobrescrito sin @Override (Es decir mala practica)
    }
}
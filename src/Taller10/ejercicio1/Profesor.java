package taller10.ejercicio01;

class Persona {
    protected String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void presentarse() {
        System.out.println("Hola, soy una persona llamada " + nombre + ".");
    }
}

class Estudiante extends Persona {
    private String carrera;

    public Estudiante(String nombre, String carrera) {
        super(nombre);
        this.carrera = carrera;
    }

    @Override
    public void presentarse() {
        System.out.println("Hola, soy " + nombre + " y estudio la carrera de " + carrera + ".");
    }
}

public class Profesor extends Persona {
    private String asignatura;

    public Profesor(String nombre, String asignatura) {
        super(nombre);
        this.asignatura = asignatura;
    }

    @Override
    public void presentarse() {
        System.out.println("Hola, soy el profesor " + nombre + " e imparto la asignatura de " + asignatura + ".");
    }

    public static void main(String[] args) {
        Persona p1 = new Persona("Isabella Valenzuela");
        Persona p2 = new Estudiante("Miguel Arias", "Ingeniería de Software");
        Persona p3 = new Profesor("John Carlos Arrieta", "Programación Orientada a Objetos");

        System.out.println("--- Demostración de Polimorfismo ---");
        p1.presentarse();
        p2.presentarse();
        p3.presentarse();
    }
}
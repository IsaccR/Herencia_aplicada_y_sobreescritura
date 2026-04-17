package HerenciaAplicada.ejercicio01;

public class Estudiante extends Persona {
    private String carnet;

    public Estudiante(String nombre, int edad, String carnet) {
        super(nombre, edad);
        this.carnet = carnet;
    }

    
    public void mostrar() {
        super.mostrar();
        System.out.println("Carnet: " + carnet);
    }
}

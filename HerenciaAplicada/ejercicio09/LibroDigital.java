package HerenciaAplicada.ejercicio09;

public class LibroDigital extends Libro {
    private double tamañoMB;

    public LibroDigital(String titulo, String autor, double tamañoMB) {
        super(titulo, autor);
        this.tamañoMB = tamañoMB;
    }

    
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Formato: Digital | Tamaño: " + tamañoMB + " MB");
    }
}

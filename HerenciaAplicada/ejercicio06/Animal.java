package HerenciaAplicada.ejercicio06;

public class Animal {
    protected String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    public void hacerSonido() {
        System.out.println("El animal hace un sonido genérico...");
    }
}
package HerenciaAplicada.ejercicio06;

public class Perro extends Animal {
    private String nombre;

    public Perro(String especie, String nombre) {
        super(especie);
        this.nombre = nombre;
    }

   
    public void hacerSonido() {
        
        System.out.println(nombre + " el " + especie + " dice: ¡Guau! ¡Guau!");
    }
}
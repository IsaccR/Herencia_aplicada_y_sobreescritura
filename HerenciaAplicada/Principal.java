package HerenciaAplicada;


import HerenciaAplicada.ejercicio01.Docente;
import HerenciaAplicada.ejercicio01.Estudiante;

public class Principal {
 public static void main(String[] args) {
     
     System.out.println(" EJERCICIO 1");
     
     
     Docente miDocente = new Docente("Aisack", 28, "Programación Orientada a Objetos");
     
     Estudiante miEstudiante = new Estudiante("Carlos Gomez", 20, "2026-09001");

     
     System.out.println("\n  Datos del Docente:");
     miDocente.mostrar();
     
     System.out.println("\n  Datos del Estudiante:");
     miEstudiante.mostrar();
     
     System.out.println("\n------------------------------------");
 }
}

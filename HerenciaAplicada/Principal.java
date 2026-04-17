package HerenciaAplicada;

//EJERCICIO 1

import HerenciaAplicada.ejercicio01.Docente;
import HerenciaAplicada.ejercicio01.Estudiante;
import HerenciaAplicada.ejercicio02.CuentaCorriente;

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
 
 
    //EJERCICIO 2
 

 System.out.println("\n EJERCICIO 2 ");
 
 
 CuentaCorriente miCuenta = new CuentaCorriente(100, 50);
 
 System.out.println("Saldo inicial: $100 | Límite sobregiro: $50");
 
 
 System.out.print("Retirando $80: ");
 miCuenta.retirar(80);
 
 
 System.out.print("Retirando $40 (Usando sobregiro): ");
 miCuenta.retirar(40); 
 
 
 System.out.print("Retirando $100 (Debe fallar): ");
 miCuenta.retirar(100);
 }
}




package HerenciaAplicada;


import HerenciaAplicada.ejercicio01.Docente;
import HerenciaAplicada.ejercicio01.Estudiante;
import HerenciaAplicada.ejercicio02.CuentaCorriente;
import HerenciaAplicada.ejercicio03.ProductoPerecedero;
import HerenciaAplicada.ejercicio04.Bus;
import HerenciaAplicada.ejercicio05.Empleado;
import HerenciaAplicada.ejercicio05.Gerente;
import HerenciaAplicada.ejercicio06.Animal;
import HerenciaAplicada.ejercicio06.Perro;
import HerenciaAplicada.ejercicio07.Moto;
import HerenciaAplicada.ejercicio08.Rectangulo;
import HerenciaAplicada.ejercicio09.LibroDigital;
import HerenciaAplicada.ejercicio10_facturacion.*;

//EJERCICIO 1
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
 
   
 //EJERCICIO 3
 System.out.println("\nEJERCICIO 3: PRODUCTO PERECEDERO ");
 
 
 ProductoPerecedero leche = new ProductoPerecedero("Leche Entera", 15.50, 5);
 leche.mostrarInfo();
 
 System.out.println("-------------------------");
 
 ProductoPerecedero pan = new ProductoPerecedero("Pan de Caja", 22.00, 0);
 pan.mostrarInfo();
 
    //EJERCICIO 4
 System.out.println("\n EJERCICIO 4: TRANSPORTE Y BUS ");
 
 Bus busUrbano = new Bus(45, "Ruta 10 - Centro Jutiapa");
 busUrbano.descripcion();
 
 System.out.println("-------------------------");
 
 Bus busEscolar = new Bus(20, "Recorrido Municipios");
 busEscolar.descripcion();
 
//EJERCICIO 5
 System.out.println("\n EJERCICIO 5: EMPLEADO Y GERENTE ");
 
 Empleado emp = new Empleado("Ana Martinez", 5000.00);
 emp.mostrarInfo();
 
 System.out.println("-------------------------");
 
 Gerente ger = new Gerente("Luis Perez", 8000.00, 2500.00);
 ger.mostrarInfo();
 
  //EJERCICIO 6
 System.out.println("\n EJERCICIO 6: ANIMAL Y PERRO ");
 
 Animal animalGenerico = new Animal("Ser vivo");
 animalGenerico.hacerSonido();
 
 System.out.println("-------------------------");
 
 Perro miPerro = new Perro("Perro", "Isaac");
 miPerro.hacerSonido();
 
// EJERCICIO 7
 System.out.println("\n EJERCICIO 7: VEHÍCULO Y MOTO ");
 
 Moto miMoto = new Moto("Pulsar", 90, 135);
 miMoto.mostrarInfo();
 
// EJERCICIO 8
 System.out.println("\n EJERCICIO 8: FIGURA Y RECTÁNGULO ");
 
 Rectangulo rect = new Rectangulo(10, 5);
 rect.mostrarInfo();
 
// PRUEBA EJERCICIO 9
 System.out.println("\n EJERCICIO 9: LIBRO Y LIBRO DIGITAL ");
 
 LibroDigital libro1 = new LibroDigital("El Quijote", "Miguel de Cervantes", 4.5);
 libro1.mostrarInfo();
 
 System.out.println("-------------------------");
 
 LibroDigital libro2 = new LibroDigital("Palabras que nuca dije ", "Pablo Sznajdleder", 12.8);
 libro2.mostrarInfo();
 
// EJERCICIO 10
 System.out.println("\n EJERCICIO 10: SISTEMA DE FACTURACIÓN ");
 
 Cliente miCliente = new Cliente("David ", "1234567-8");
 
 System.out.println(" Generando Factura al Contado...");
 FacturaContado fc = new FacturaContado(101, miCliente, 500.00, 50.00);
 fc.mostrarFactura();
 
 System.out.println("-------------------------");
 
 System.out.println(" Generando Factura al Crédito...");
 FacturaCredito fr = new FacturaCredito(102, miCliente, 1000.00, 100.00, 3);
 fr.mostrarFactura();
 }
}




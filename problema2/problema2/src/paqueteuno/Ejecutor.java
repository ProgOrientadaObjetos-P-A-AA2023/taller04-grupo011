
package paqueteuno;
import paquetedos.Profesor;

public class Ejecutor {
    public static void main(String[] args) {
         Profesor pr = new Profesor(500);
       Profesor pr2 = new Profesor("Carlos","Samaniego",700, "1103678943");
       pr.establecerNombre("Alex");
       pr.establecerApellido("Ruiz");
       pr.establecerCedula("1103478924");
       pr.calcularSueldoT();
       pr2.calcularSueldoT();
       System.out.println("Imprimir Consturctor Uno");
       System.out.println(pr);
       System.out.println("------------------------------------------");
       System.out.println("Imprimir Consturctor  Dos");
      System.out.println(pr2);
    }
    
}

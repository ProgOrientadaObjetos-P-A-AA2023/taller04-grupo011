
package paqueteuno;
import paquetedos.Estudiante;
public class Ejecutor {


    public static void main(String[] args) {
       Estudiante alfa = new Estudiante();
       Estudiante alfa2 = new Estudiante("Juan Carlos Alvarez Torres", 5.6, 10, 7.8);
       alfa.establecerNombreEstudiante("Ricardo Tapia");
       alfa.establecerMateriaUno(2.4);
       alfa.establecerMateriaDos(9);
       alfa.establecerMateriaTres(9.8);
       alfa.calcularPromedioCalificaciones();
       alfa2.calcularPromedioCalificaciones();
       System.out.println("Imprimir Consturctor Uno");
       System.out.println(alfa2);
       System.out.println("------------------------------------------");
       System.out.println("Imprimir Consturctor  Dos");
      System.out.println(alfa);
    }
}


package paqueteuno;
import paquetedos.Automotor;
public class Ejecutor {

    public static void main(String[] args) {
           Automotor au= new Automotor("1103598023");
       Automotor au2 = new Automotor("1103578934","Toyota",2004, 5560);
       au.establecerCedDuenio("113876234");
       au.establecerMarVehiculo("Chévrolet");
       au.establecerAnioFabricacion(2009);
       au.establecerValorVehiculo(6980);
       au.calcularValMatricula();
       au2.calcularValMatricula();
       System.out.println("Imprimir Consturctor Uno");
       System.out.println(au);
       System.out.println("------------------------------------------");
       System.out.println("Imprimir Consturctor  Dos");
      System.out.println(au2);
    }
    
}


package paqueteuno;

import paquetedos.Cheque;
public class Ejecutor {


    public static void main(String[] args) {
              Cheque ch= new Cheque("Ronaldo Sanchez");
       Cheque ch2 = new Cheque("Jean Maldonado","Banco de Loja",2789);
       ch.establecerNombreC("113876234");
       ch.establecerNombreB("Chévrolet");
       ch.establecerValorCh(2009);
       ch.calcularComision();
       ch2.calcularComision();
       System.out.println("Imprimir Consturctor Uno");
       System.out.println(ch);
       System.out.println("------------------------------------------");
       System.out.println("Imprimir Consturctor  Dos");
      System.out.println(ch2);
    }
    
}

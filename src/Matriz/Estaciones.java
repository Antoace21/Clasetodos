package Matriz;

public class Estaciones {
    public static void main(String[] args) {

        String estaciones[][]=new String[2][2];

        estaciones[0][0]="otoño";
         estaciones[0][1]="verano";
         estaciones[1][0]="invierno";
         estaciones[1][1]="primavera";

         System.out.println("Estacion en la posicion (0,0 ) " +estaciones[0][0]);
         System.out.println("Estacion en la posicion (0,1) " +estaciones[0][1]);
         System.out.println("Estacion en la posicion (1,0) " +estaciones[1][0]);
         System.out.println("Estacion en la posicion (1,1) " +estaciones[1][1]);
    }
}

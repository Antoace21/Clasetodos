package Arreglos;

import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {

        System.out.println("Suma total de los numeros digitados");

        Scanner write = new Scanner(System.in);
        float suma = 0;

        int [] numeros=new int [10];

        for (int i=0; i<10; i++) {
            System.out.printf("Ingrese el numero en la posicion " + (i) + ":");
            numeros[i] =write.nextInt();

        }
        for(int i=0; i<numeros.length; i++){
            suma +=numeros[i];
        }

        System.out.println("La suma es:"  +suma);



    }
}

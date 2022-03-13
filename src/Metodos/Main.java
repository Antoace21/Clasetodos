package Metodos;

import java.util.Scanner;

public class Main {

    //Programa que lee por teclado un año y calcula y muestra si es bisiesto. Para realizar el cálculo se
    //utiliza un método llamado esBisiesto.
    //El método esBisiesto tiene un parámetro de tipo entero llamado a. Será el encargado de recibir el
    //valor del año a comprobar si es bisiesto o no. El método devuelve un valor de tipo boolean.
    //Devuelve true si el año recibido es bisiesto y false si no lo es.
    //Como el método devuelve un dato de tipo boolean se puede llamar dentro de una instrucción if.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int año;
        System.out.print("Introduce año: ");
        año = sc.nextInt();
        if (esBisiesto(año)) { //llamada al método
            System.out.println("Bisiesto");
        } else {
            System.out.println("No es bisiesto");
        }
    }

            /*
             *metodo que calcula si un año es o no bisiesto
             */
            public static boolean esBisiesto ( int a){
                if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0)
                    return true;
                else
                    return false;
            }

}



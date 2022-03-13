package for2;

import java.util.Scanner;

public class ejercicio1 {


        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);
            int suma = 0;
            System.out.println("Digite dos numeros enteros");
            System.out.println("Numero 1");
            int Numero1 = entrada.nextInt();

            System.out.println("Numero 2");
            int Numero2 = entrada.nextInt();

            if (Numero1 < Numero2) {
                System.out.println(Numero1 + "es menor que " + Numero2);
                for (int i = Numero1; i <= Numero2; i++)
                    suma += i;
                System.out.println(suma);
            } else {
                if (Numero2 < Numero1)
                    System.out.println(Numero2 + "Es menor que " + Numero1);
                for (int i = Numero2; i <= Numero1; i++)
                    suma += i;
                System.out.println(suma);
            }
        }
    }


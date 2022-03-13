package Metodos;

import java.util.Scanner;

public class Operaciones {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Se solicitan dos numeros enteros y se realizan operaciones basicas");

        int n1=Integer.MIN_VALUE;
        do {
            System.out.println("Digite el primer numero: ");
            if (sc.hasNextInt()) {
                n1 = sc.nextInt();
                break;
            }
            sc.next();

        } while(n1 == Integer.MIN_VALUE);
        System.out.println(n1);


    }
}

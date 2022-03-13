package Dowhile;

import java.util.Scanner;

public class Nnumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i = 1;
        int suma = 0;
        System.out.println("¿Cuántos números desea ingresar?");
        int n = entrada.nextInt();
        while (i <= n) {
            System.out.println("Ingrese un número entero");
            int num=entrada.nextInt();
            suma+=num;
            i++;
        }
        System.out.println("La suma de los números es:"+suma);

    }
}

package Cicloswhile;
import java.util.Scanner;
public class Cuadrado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Imprime el cuadrado de números positivos introducidos y la suma de sus cuadrados. Se finaliza con 0");
        int suma = 0;
        int num = 1;
        while (num > 0) {
            System.out.println("Ingrese un número entero positivo");
            num=entrada.nextInt();
            double cuadrado= Math.pow(num,2);
            System.out.println(cuadrado);
            suma+=cuadrado;
        }
        System.out.println("La suma de los cuadrados introducidos es:"+suma);
    }
}


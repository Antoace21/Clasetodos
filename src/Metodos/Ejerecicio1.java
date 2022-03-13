package Metodos;

import java.util.Scanner;

public class Ejerecicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa que realiza las operaciones basicas ");
        System.out.println("Digite el primer numero");
        int n1 = sc.nextInt();
        System.out.println("Digite el segundo numero");
        int n2 = sc.nextInt();
        int resultado = sumar(n1, n2);
        int res = multiplicar(n1 , n2);
        int fin = dividir(n1 , n2);
        int ya = restar(n1 , n2);

        System.out.println("suma "+resultado);
        System.out.println("multiplicar " +res);
        System.out.println("dividir " +fin);
        System.out.println("restar " +ya);



    }


    public static int sumar(int a, int b){
            int c;
            c=a+b;
            return c;

        }
        public static int multiplicar(int a, int b){
            int c;
            c=a*b;
            return c;
        }
       public static int dividir(int a, int b){
            int c;
            c=a/b;
            return c;

        }
        public static int restar(int a, int b){
           int c;
           c=a-b;
            return c;

        }






    }


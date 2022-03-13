package Metodos;

import java.util.Scanner;

public class operacionesbasicasMetodos {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Programa que realiza las operaciones basicas ");
            System.out.println("Digite el primer numero");
            int n1 = sc.nextInt();
            System.out.println("Digite el segundo numero");
            int n2 = sc.nextInt();
            int resultado = sumar(n1, n2);
            int res = multiplicar(n1 , n2);
            int ya = restar(n1 , n2);

            System.out.println("suma "+resultado);
            System.out.println("multiplicar " +res);
            System.out.printf( "  dividir %.2f",+dividir(n1,n2) );
            System.out.println();
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
        public static double dividir(int a, int b){
            double c;
            c=a/b;
            return c;


        }
        public static int restar(int a, int b){
            int c;
            c=a-b;
            return c;

        }
        //public static void imprimir(int a , int b){

           //System.out.println("suma "+resultado);
           // System.out.println("multiplicar " +res);
          //  System.out.println("dividir " +fin);
          //  System.out.println("restar " +ya);
      //15
    // ssssssss}






    }


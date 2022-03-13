package Ordenacion;

import javax.swing.*;
import java.util.Scanner;

public class Ordenacion_rapida_quicksort {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de elementos"));

        int[] A = new int[n];
        int N = 1;

        for (int i = 0; i < A.length; i++) {
            System.out.println("Ingrese el valor #" + (i + 1) + ":");
            A[i] = s.nextInt();

        }
        System.out.println("Los elementos antes de ordenar");

        for (int arr : A) {
            System.out.printf("%d ", arr);
        }

        int Izq = 0;
        int Der = (A.length - 1);
        ordenacionRapida(A, Izq, Der);
        System.out.println("LOs elementos despues de ordenar son : ");

        for (int arr : A) {
            System.out.printf("%d ", arr);
        }
    }

        public static void ordenacionRapida ( int A[], int prin, int ult) {
            int pivote = A[prin];                                   // tomamos primer elemento como pivote
            int i = prin;                                     // i realiza la búsqueda de izquierda a derecha
            int j = ult;                                       // j realiza la búsqueda de derecha a izquierda
            int aux;
            while (i < j) {                                         // mientras no se crucen las búsquedas
                while (A[i] <= pivote && i < j) i++;               // busca elemento mayor que pivote
                while (A[j] > pivote) j--;                   // busca elemento menor que pivote
                if (i < j) {                               // si no se han cruzado
                    aux = A[i];                             // los intercambia
                    A[i] = A[j];
                    A[j] = aux;
                }
            }

            A[prin] = A[j]; // se coloca el pivote en su lugar de forma que tendremos
            A[j] = pivote; // los menores a su izquierda y los mayores a su derecha


            if (prin < j - 1)
                ordenacionRapida(A,prin, j - 1); // ordenamos subarray izquierdo
            if (j + 1 < ult)
                ordenacionRapida(A, j + 1, ult);
        // ordenamos subarray derecho

        }
    }






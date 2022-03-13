package Ordenacion;
import static Metodos.OrdenacionInsercion.*;  //asi se manda a llamar un metodo

import javax.swing.*;
import java.util.Scanner;

public class Insercion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=Integer.parseInt(JOptionPane.showInputDialog("Ingresar la cantidad de elementos"));
        int arreglo[]=new int[n];
        for (int i=0; i<n; i++) {
            System.out.println("Digite el valor" + (i + 1) + " :");

            arreglo[i]=sc.nextInt();

        }
        System.out.println("el arreglo sin ordenar es: ");
        for (int arr:arreglo){

            System.out.printf("%d, " , arr);

        }
        System.out.println();
        System.out.println("El arreglo ordenado es : ");
        insercionDirecta(arreglo);

        for (int arr:arreglo){
            System.out.printf("%d, " , arr);
        }








    }
}

package Arreglos;

import java.util.Scanner;

public class MAtriz {

    public static void main(String[] args) {
        Scanner write=new Scanner(System.in);

        int matriz[][]={{4,5,5,7,3,},{5,6,4,3,7},{6,7,8,9,8}};

       System.out.println(matriz.length);
       System.out.println(matriz[0].length);

        int a[][]=new int [3][5];
         a[0][0]=10;
        a[0][1]=20;
        a[0][2]=30;

        System.out.println("¿Cuantas filas tiene el arreglo?");
        int filas=write.nextInt();
        System.out.println("¿Cuantas columnas tiene el arreglo?");
        int columnas= write.nextInt();

        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                System.out.print("a["+i+"] ["+j+"]=");
                int valor=write.nextInt();
                a[i] [j]=valor;


            }
            System.out.println();
        }
        int i,j;
        //llenado de las filas
        for(i=0; i<a.length; i++){
            //recorrido de las columnas de una fila
            for( j=0; j<a[0].length; j++){
                System.out.print("a["+i+"] ["+j+"]=+a[i] [j]+ ");
                int valor= write.nextInt();
                a[i] [j]=valor;
            }
            System.out.println();
        }
        //recorrido del arreglo
        for(i=0; i<a.length; i++){
            //recorrido de las columnas de un fila
            for(j=0; j<a[0].length; j++){
                System.out.println("a["+i+"] ["+j+"]=+a[i] [j]+ ");
            }
            System.out.println();
        }



    }
}

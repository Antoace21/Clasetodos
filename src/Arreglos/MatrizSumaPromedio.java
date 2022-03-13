package Arreglos;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class MatrizSumaPromedio {

    public static void main(String[] args) {

        Scanner write=new Scanner(System.in);
        float matriz[][];
        float suma=0.0f, promedio=0.0f;
        int f,c;

        do{
            System.out.print("Digite la cantidad de filas : ");
            f=write.nextInt();
        }while (f<=0);

        do{
            System.out.print("Digite la cantidad de columnas: ");
            c= write.nextInt();
        }while(c<=0);

        matriz=new float [f][c];

        System.out.println();
        System.out.println("Digite los elementos de la matriz");
        System.out.println();

        for(int i=0; i< matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print("Elemento["+i+"]["+j+"]: ");
                matriz[i][j]=write.nextFloat();
                suma+=matriz[i][j];
            }
        }
        promedio=suma/(matriz.length*matriz[0].length);
        System.out.println();
        for(int i=0; i< matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.format("%10.2f", matriz[i][j]);
            }
            System.out.println();

        }
        System.out.println();
        System.out.format("suma: %15.2f,\npromedio: %10.2f\n", suma,promedio);

    }
}

package Arreglos;

import java.util.Scanner;

public class Elementosdeunamatriz {

    public static void main(String[] args) {

        int matriz[][]=new int [3][3];

        Scanner write=new Scanner (System.in);

        for (int i=0; i< matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print("Elemento["+i+"]["+j+"]: ");
                matriz[i][j]= write.nextInt();
            }
            System.out.println();
        }
        for(int i=0; i< matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");


            }
            System.out.println();
        }




    }
}

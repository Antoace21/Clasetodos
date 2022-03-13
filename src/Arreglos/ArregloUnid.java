package Arreglos;

import java.util.Scanner;

public class ArregloUnid {

    public static void main(String[] args) {
        int numero[]={2,6,4,5,3,7,8,8,6,5};
        int []num={2,4,4,7,3,7,0,8,6,5};
        char [] caracter={'a', 'g', 'G', 'f', 'S', 's'};
        String [] depto={"Managua", "Masaya", "Granada", "Carazo","Rivas" };
        float [] decimales={5,4,5,7,8,9,9,6,5};
        boolean [] valor={true, false, true, true};

        int [] valores=new int [5];

        valores[0]=90;
        valores[1]=2;
        valores[2]=40;
        valores[3]=2;
        valores[4]=8;

        Scanner entrada=new Scanner(System.in);
        System.out.println("Escribe la cantidad de valores a introducir");
        int n=entrada.nextInt();

        int [] arreglo=new int[n];

        System.out.println(numero.length);


    }
}

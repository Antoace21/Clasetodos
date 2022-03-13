package Arreglos;

public class copiadearreglo {

    public static void main(String[] args) {

        int arreglo1[]=new int [5];

        arreglo1[0]=5;
        arreglo1[1]=10;
        arreglo1[2]=15;
        arreglo1[3]=20;
        arreglo1[4]=20;

       // for(int val:arreglo1){
        //  System.out.println(val);

        for(int i=0; i<5; i++){
            System.out.println("arreglo["+1+"]= " +arreglo1[i]);
        }

        int arreglo2[]=arreglo1;

        arreglo2[2]=100;
        arreglo2[3]=200;

        for(int i=0; i<5; i++) {
            System.out.println("arreglo1[" + i + "]= " + arreglo1[i]);
            System.out.println("arreglo2["+i+"]= "+arreglo2[i]);
        }

    }
}

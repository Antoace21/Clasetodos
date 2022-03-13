package Arreglos;

public class matriznombre {

    public static void main(String[] args) {
        String nombres[][] = {   { "Pepito" ,"Chepito" } ,
                { "Juancito " + 1 , "Ana " + 2},
                { "Rosa" , "Zoyla" }
        };

        for(int i=0;i<nombres.length;i++){
            for(int j=0;j<nombres[i].length;j++){
                System.out.format("%12s",nombres[i][j]);
            }
            System.out.println();
        }
    }
}



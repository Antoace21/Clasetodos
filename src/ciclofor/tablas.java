package ciclofor;

public class tablas {
    public static void main(String[] args) {
        System.out.println("Tablas de multiplicar");
        for (int i = 1; i <= 12; i++) {
            System.out.println();
            for (int j = 1; j <= 12; j++) {
                System.out.printf("%2d X %2d = %3d \t",i,j,i*j);
            }
        }
    }
}




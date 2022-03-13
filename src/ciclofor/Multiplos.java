package ciclofor;

public class Multiplos {
    public static void main(String[] args) {
        int contador = 0;
        for (int i = 1; i <= 100; i++) {

            if (i % 5 == 0) {

                System.out.println(i);
                contador++;

            }
        }
        System.out.println("En total hay " +contador+ " numeros multiplos de 5 ");
    }


}

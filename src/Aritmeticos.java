import java.util.Scanner;

public class Aritmeticos {
    public static void main(String[] args) {

        int x = 7;
        int y = 5;

        int suma = x + y;
        int resta = x - y;
        int mult = x * y;
        float divide =(float) x/(float)y;
        int resto = x % y;

        System.out.println("La suma de x con y es: " + suma);
        //Otro ejemplo es realizar la suma en el ,is,o print
        System.out.println("La suma de x + y es: "+(x+y));
        System.out.println("La resta de x-y es: "+resta);
        System.out.printf("La division de x/y es. %.2f" ,divide);
        System.out.println("LA mult de x * y es: "+mult);
        System.out.println("El resto de divdir x % y es: "+resto);


        Scanner entrada=new Scanner(System.in);
        String nombre=entrada.nextLine();

        System.out.println("Escribe dos numeros");
        System.out.println("Num 1:");
        int n1=entrada.nextInt();
        System.out.println("Num 2:");
        int n2=entrada.nextInt();

        int sum=n1+n2;
        System.out.println("La suma es: "+sum);


    }

}

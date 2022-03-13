package SelectivasSwitchCase;
import java.util.Scanner;
public class menu {
    public static void main(String[] args){
       Scanner entrada=new Scanner(System.in);

        System.out.println("-------MENU-------");
        System.out.println("1. BIENVENIDA");
        System.out.println("2. CALCULAR TOTAL A PAGAR");
        System.out.println("3. EN NOMBRE DEL MAYOR DE TRES PERSONAS");
        System.out.println("4. PROMEDIAR LAS NOTAS DEL SEMESTRE");
        System.out.println("5. TERMINAR");
        System.out.println("-------------------");
        System.out.print("POR FAVOR INGRESE LA OPCION DE SU PREFERENCIA:");

        int opcion=entrada.nextInt();

        entrada.nextLine();

        switch(opcion) {

            case 1:
                System.out.println("bienvenidos al menu");
                break;
            case 2:
                System.out.println("compra de un producto");
                System.out.println("ingresa el nombre del producto:");
                String producto = entrada.nextLine();
                System.out.println("escriba el precio:");
                Float precio = entrada.nextFloat();
                System.out.println("escriba cantidad:");
                Float cant = entrada.nextFloat();
                double total = precio * cant;
                System.out.println("el total a pagar es:" + total);
                break;

            case 3:
                System.out.println("nombre de la persona 1:");
                String nombre1 = entrada.nextLine();
                System.out.println("digite la edad de la persona 1:");
                int edad1 = entrada.nextInt();

                System.out.println("nombre de la persona 2:");
                String nombre2 = entrada.nextLine();
                System.out.println("digite la edad de la persona 2:");
                int edad2 = entrada.nextInt();

                System.out.println("nombre de la persona 3:");
                String nombre3 = entrada.nextLine();
                System.out.println("digite la edad de la persona 3:");
                int edad3 = entrada.nextInt();

                if (edad1 > edad2 && edad1 > edad3)

                    System.out.println(nombre1 + "es el mayor con" + edad1);
                else {
                    if (edad2 > edad1 && edad2 > edad3) {
                        System.out.println(nombre2 + "es el mayor con" + edad2);
                    } else

                        System.out.println(nombre3 + "es el mayor con" + edad3);
                    break;
                }
            case 4:
                System.out.println("ingrese 6 notas:");

                int n1 = entrada.nextInt();
                int n2 = entrada.nextInt();
                int n3 = entrada.nextInt();
                int n4 = entrada.nextInt();
                int n5 = entrada.nextInt();
                int n6 = entrada.nextInt();

                float promedio = (n1 + n2 + n3 + n4 + n5 + n6) / 6;
                System.out.println("el promedio de las 6 notas es:" + promedio);
                break;
            case 5:
                System.out.println("gracias por utilizar el menu");
                break;
            default:
                System.out.println("OPCION NO VALIDA!!!!");
        }

    }
}
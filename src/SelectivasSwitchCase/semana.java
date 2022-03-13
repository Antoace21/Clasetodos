package SelectivasSwitchCase;

import java.util.Scanner;
public class semana {
    public static void main(String[] args){

        Scanner entrada=new Scanner(System.in);
        System.out.println("escriba el nombre de un dia");

        String dia=entrada.nextLine();

        switch(dia){

            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves:":
            case "viernes":
                System.out.println("es un dia de la semana");
                break;

            case "sabado":
            case "domingo":
                System.out.println("es un dia de fin de semana");
                break;

                default:
                System.out.println("no es valido");


        }

    }
}

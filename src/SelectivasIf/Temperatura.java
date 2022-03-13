package SelectivasIf;
import java.util.Scanner;

public class Temperatura {

    public static void main(String[] Args){

        Scanner entrada=new Scanner(System.in);

        System.out.println("Escriba una temperatura");
        float tempt =entrada.nextFloat();

        if(tempt >=21&& tempt <=24)
            System.out.println("Temperatura baja "+ tempt);
        else{
            if(tempt >=25&& tempt <=30)
                System.out.println("Temperatura media "+ tempt);
            else{
                if(tempt >=31&& tempt <=35)
                    System.out.println("Temperatura alta "+ tempt);
                else{
                    if(tempt >35)
                        System.out.println("Se quema");
                    else
                        System.out.println("Se congela");
                    }


                }

            }


   		System.out.println("Te amo");
    }

}

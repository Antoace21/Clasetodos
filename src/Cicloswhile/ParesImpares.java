package Cicloswhile;

import java.util.Scanner;

public class ParesImpares {

        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            int i = 1;
            int suma_par=0,suma_impar=0;
            int cont_par=0,cont_impar = 0;
            System.out.println("¿Cuántos números desea ingresar?/ Se contabilizarán y sumarán los pares y cuantos impares");
            int n = entrada.nextInt();
            while (i <= n) {
                System.out.println("Ingrese un número entero");
                int num=entrada.nextInt();
                if(num%2==0)
                {
                    suma_par += num;
                    cont_par+=1;
                }
                else{
                    suma_impar+=num;
                    cont_impar+=1;
                }
                i++;
            }
            System.out.println("Hay "+cont_par+" pares y suman: "+suma_par);
            System.out.println("Hay "+cont_impar+" impares y suman: "+suma_impar);
        }
    }


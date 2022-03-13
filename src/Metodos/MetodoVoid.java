package Metodos;

import java.util.Scanner;

public class MetodoVoid {

    public static void main(String[] args) {

        //Ejemplo 3
        //Método que no devuelve ningún valor

        Scanner sc=new Scanner(System.in);

        String cadena;

        System.out.print("Introduce una cadena de texto");
        cadena=sc.nextLine();
        cajaTexto(cadena); //llamada al meyodo
    }
    //metodo que muestra un string rodeado por un borde

    public static void cajaTexto(String str){
        int n=str.length(); //longitud del string

        for(int i=1; i<=n +4;i++){ //borde de arriba
            System.out.print("-");

        }

        System.out.println();
        System.out.println("- " + str + "- "); //cadena con un borde a cada lado

        for(int i=1; i<n +4; i++) { //borde de abajo
            System.out.print("-");
        }
        System.out.println();

        //Descripción:
        //1. El método cajaTexto tiene un parámetro de tipo String.
        //2. El String que recibe lo muestra por pantalla rodeado con un borde.
        //3. Este método no devuelve nada, solo se limita a mostrar el String por pantalla.
        //4. Cuando un método no devuelve nada hay que indicar void como tipo devuelto.
        //5. Como el método no devuelve nada no es necesario escribir la sentencia return.
        //6. El método acaba cuando se alcanza la llave final.
    }
}

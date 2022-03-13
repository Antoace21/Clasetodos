package Metodos;

import java.util.Scanner;

public class MetodoParametro {

    public static void main(String[] args) { //declaracion del metodo principal
        escribenombre(); //invocacion al metodo
    }

    //declaracion del metodo
    public static void escribenombre() {
        String nombre = ""; //inicializamos el valor de la variable nombre
        Scanner sc = new Scanner(System.in); //crea un objeto

        System.out.println("Ingrese su nombre: ");
        nombre = sc.next();
        System.out.println("El nombre ingresado es: " + nombre);
        //return nombre


        //Descripción:
        //1. Nótese que al retornar el valor de tipo String este se concatena como parte de la cadena de impresión
        //dentro del método Println.
        //2. Todo el proceso se ejecuta desde el método sin necesidad de retornar ningún valor, solamente se hace
        //la invocación desde el método MAIN.
    }

}

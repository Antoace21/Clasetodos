package Todos;

public class Variables {
    public static void main(String[] args) {

        int edad = 18;

        double altura = 1.70;

        char sexo = 'M';

        float telefono = 81628943;
        String nombre = "Gerald";
        boolean funciona=true;

        int decada=10;

        int decadas=edad/decada;

        System.out.println("Mi nombre es " +nombre+ ", tengo " + edad + " años y mido " +
                altura + " metros");
        System.out.println("He vivido "+decadas+" decadas");
        System.out.printf("He vivido %d decadas\n", +decadas);
        System.out.printf("Mi nombre es: %s, y mido: %.2f de altura\n",nombre,altura);
        float pi=3.1415f;
        System.out.println(pi);
    }
}

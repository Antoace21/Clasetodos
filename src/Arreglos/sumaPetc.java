package Arreglos;

import java.util.Scanner;

public class sumaPetc {
    //Pedir 10 números por teclado y obtener la suma, promedio, el número menor, el número mayor y
    //cuántas veces se repite cada número.
    public static void main(String[] args) {

        System.out.println("Ingrese 10 numeros Reales");

        Scanner write = new Scanner(System.in);
        float suma = 0;


        int num1 = write.nextInt();
        int num2 = write.nextInt();
        int num3 = write.nextInt();
        int num4 = write.nextInt();
        int num5 = write.nextInt();
        int num6 = write.nextInt();
        int num7 = write.nextInt();
        int num8 = write.nextInt();
        int num9 = write.nextInt();
        int num10 = write.nextInt();
        suma = (num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10);
        System.out.println("La suma total es: " + suma);

        float promedio = (num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10) / 10;
        System.out.println("El promedio seria de: " + promedio);

        if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5 && num1 < num6 && num1 < num7 && num1 < num8 && num1 < num9 && num1 < num10) {

            System.out.println("El numero menor es: " + num1);
        } else {
            if (num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5 && num2 < num6 && num2 < num7 && num2 < num8 && num2 < num9 && num2 < num10) {

                System.out.println("El numero menor es: " + num2);

            } else {
                if (num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5 && num3 < num6 && num3 < num7 && num3 < num8 && num3 < num9 && num3 < num10) {
                    System.out.println("El numero menor es: " + num3);
                } else {
                    if (num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5 && num4 < num6 && num3 < num7 && num4 < num8 && num4 < num9 && num4 < num10) {
                        System.out.println("El numero menor es: " + num4);
                    } else {
                        if (num5 < num1 && num5 < num2 && num5 < num3 && num5 < num4 && num5 < num6 && num5 < num7 && num5 < num8 && num5 < num9 && num5 < num10) {
                            System.out.println("El numero menor es: " + num5);
                        } else {
                            if (num6 < num1 && num6 < num2 && num6 < num3 && num6 < num4 && num6 < num4 && num6 < num5 && num6 < num7 && num6 < num8 && num6 < num9 && num6 < num10) {
                                System.out.println("El numero menor es: " + num6);

                            } else {
                                if (num7 < num1 && num7 < num2 && num7 < num3 && num7 < num4 && num7 < num5 && num7 < num6 && num7 < num8 && num7 < num9 && num7 < num10) {
                                    System.out.println("El numero menor es: " +num7);

                                } else {
                                    if (num8 < num1 && num8 < num2 && num8 < num3 && num8 < num3 && num8 < num4 && num8 < num5 && num8 < num6 && num8 < num7 && num8 < num9 && num8 < num10) {
                                        System.out.println("El numero menor es: " +num8);

                                    } else {
                                        if (num9 < num1 && num9 < num2 && num9 < num3 && num8 < num4 && num9 < num5 && num9 < num6 && num9 < num7 && num9 < num8 && num9 < num10) {
                                            System.out.println("El  numero menor es : "+num9);

                                        } else {
                                            if(num10<num1 && num10<num2 && num10<num3 && num10<num4 && num10<num5 && num10<num6 && num10<num7&& num10<num8 && num10<num9){
                                                System.out.println("El numero menor es. " +num10);

                                            }

                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5 && num1 > num6 && num1 > num7 && num1 > num8 && num1 > num9 && num1 > num10) {
            System.out.println("El numero mayor es: " + num1);

        } else {
            if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5 && num2 > num6 && num2 > num7 && num2 > num8 && num2 > num9 && num2 > num10) {
                System.out.println("El numero maypr es: " + num2);

            } else {
                if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5 && num3 > num6 && num3 > num7 && num3 > num8 && num3 > num9 && num3 > num10) {
                    System.out.println("El numero mayor es: " + num3);

                } else {
                    if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5 && num4 > num6 && num3 > num7 && num4 > num8 && num4 > num9 && num4 > num10) {
                        System.out.println("El numero mayor es: " + num4);

                    } else {
                        if (num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4 && num5 > num6 && num5 > num7 && num5 > num8 && num5 > num9 && num5 > num10) {
                            System.out.println("El numero mayor es: " + num5);

                        } else {
                            if (num6 > num1 && num6 > num2 && num6 > num3 && num6 > num4  && num6 > num5 && num6 > num7 && num6 > num8 && num6 > num9 && num6 > num10) {
                                System.out.println("El numero mayor es: " + num6);


                            } else {
                                if (num7 > num1 && num7 > num2 && num7 > num3 && num7 > num4 && num7 > num5 && num7 > num6 && num7 > num8 && num7 > num9 && num7 > num10) {
                                    System.out.println("El numero mayor es: " +num7);


                                } else {
                                    if (num8 > num1 && num8 > num2 && num8 > num3 && num8 > num4 && num8 > num5 && num8 > num6 && num8 > num7 && num8 > num9 && num8 > num10) {
                                        System.out.println("El numero mayor es: " +num8);


                                    } else {
                                        if (num9 > num1 && num9 > num2 && num9 > num3 && num9 > num4 && num9 > num5 && num9 > num6 && num9 > num7 && num9 > num8 && num9 > num10) {
                                            System.out.println("El  numero mayor es : "+num9);


                                        } else {
                                            if(num10 > num1 && num10 > num2 && num10 > num3 && num10 > num4 && num10 > num5 && num10 > num6 && num10 > num7 && num10 > num8 && num10 > num9){
                                                System.out.println("El numero mayor es. " +num10);


                                            }

                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }





    }
}












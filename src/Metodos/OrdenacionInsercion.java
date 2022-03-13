package Metodos;

public class OrdenacionInsercion {
    public static void insercionDirecta(int A[]){
        int i, j;
        int aux;
        for (i = 1; i < A.length; i++){ // desde el segundo elemento hasta
            aux = A[i]; // el final, guardamos el elemento y
            j = i - 1; // empezamos a comprobar con el anterior
            while ((j >= 0) && (aux < A[j])){ //(la comparacion  mientras queden posiciones
// y el valor de aux sea menor
                A[j + 1] = A[j]; // que los de la izquierda, se
                j--; // desplaza a la derecha
            }
            A[j + 1] = aux; // colocamos aux en su sitio
        }
    }
}

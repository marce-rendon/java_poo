package presencial;

import java.util.Scanner;

public class NumeroMaximo {

    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println( "Ingrese el primer número: ");
        int numeroA = scanner.nextInt ();
        System.out.println( "Ingrese el segundo número: ");
        int numeroB = scanner.nextInt ();
        System.out.println( "Ingrese el tercer número: ");
        int numeroC = scanner.nextInt ();

        int maximo = maximoEntreTresNumeros (numeroA, numeroB, numeroC);
        System.out.println ("El número máximo entre los tres numeros es: " + maximo);
    }



    public static int maximoEntreTresNumeros (int unNumeroA, int unNumeroB, int unNumeroC) {
        int maximo = unNumeroA;
        if (unNumeroB > maximo) {
            maximo = unNumeroB;

        }
        if (unNumeroC > maximo) {
            maximo = unNumeroC;
        }

        return maximo;
    }
}


package presencial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println ("Bienvenidos");
        System.out.println ("Validador de edad: ");
        System.out.println ("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        char pLetra = primeraLetra(nombre);
        char uLetra = ultimaLetra(nombre);
        System.out.println ("Ingresar edad: ");
        Integer edad= scanner.nextInt ();
        System.out.println ("Ingrese su altura: ");
        Double altura= scanner.nextDouble ();
        scanner.close ();
        System.out.println ("Información recibida: ");

    }

    public static char primeraLetra (String letra) {
        System.out.println( "Su primera letra es: ");
        return letra.charAt (0);
    }

    public static char ultimaLetra (String letra) {
        System.out.println( "Su primera letra es: ");
        return letra.charAt (0);
    }

}
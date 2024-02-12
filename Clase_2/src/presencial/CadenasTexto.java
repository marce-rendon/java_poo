package presencial;

import java.util.Objects;

public class CadenasTexto {


    public static void main(String[] args) {

        String texto1 = "Hola Mundo";
        String texto2 = "Adiós Mundo";

        boolean distintas = cadenasTextoDistintas(texto1, texto2);
        System.out.println( "Las cadenas de texto son distintas: " +distintas);

    }

    private static boolean cadenasTextoDistintas(String texto1, String texto2) {
        return !Objects.equals(texto1,texto2);
    }
    
}

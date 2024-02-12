package presencial;

public class EjercicioGrupal {

    public static boolean esPrimo(int num) {
        if (num == 2) {
            return true;
        }
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++)

            if (num % i == 0) {
                return false;
            }
        return true;
    }

    public static void main (String [] args) {
        int num = 4;
        if (esPrimo (num)) {
            System.out.println(num + " es primo.");
        }
        else {
            System.out.println (num + " no es primo.");
        }
    }

}

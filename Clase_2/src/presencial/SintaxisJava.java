package presencial;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class SintaxisJava {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su apellido: ");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese su fecha de nacimiento, primero el día, luego el mes y finalmente el año: ");
        System.out.println("Día: ");
        Integer dia = scanner.nextInt();
        System.out.println("Mes: ");
        Integer mes = scanner.nextInt();
        System.out.println("Año: ");
        Integer anio = scanner.nextInt();

        //define el formato de la fecha
        DateFormat formateador= new SimpleDateFormat("dd/mm/yyyy");

        try {
            // convierte un String en formato fecha en una fecha real
            Date fecha= formateador.parse(dia + "/" + mes + "/" + anio);
            // creamos un calendario
            Calendar calendario= new GregorianCalendar();
            //hacemos calculos sobre el calendario
            calendario.setTime(fecha);
            //usamos el formateador y volvemos a mostrar la fecha
            //System.out.println("" + nombre.charAt(0));
            //System.out.println("" + apellido.charAt(0));
            System.out.println(new String("" + nombre.charAt(0)) + new String("" + apellido.charAt(0)) + " Fecha de nacimiento: " + formateador.format(calendario.getTime()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


}

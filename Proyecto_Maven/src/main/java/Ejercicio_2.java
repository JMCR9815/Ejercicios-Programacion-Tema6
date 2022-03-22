import org.joda.time.DateTime;

import java.util.Random;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Random rnd = new Random();

        DateTime[] fechas = new DateTime[5];
        for (int i = 0; i < fechas.length; i++) {
            fechas[i] = new DateTime(rnd.nextInt(2000, 2022), i + 1, i + 1, rnd.nextInt(0, 12), rnd.nextInt(0, 60), rnd.nextInt(0, 60));
        }
        mostrarFechasFormatoLargo(fechas);
    }

    public static void mostrarFechasFormatoLargo(DateTime[] fechas) {
        for (DateTime fecha : fechas) {
            System.out.println(fecha.getDayOfMonth() + " de " + fecha.monthOfYear().getAsText() + " de " + fecha.getYear() + " " + fecha.toString("HH:mm:ss"));
            //System.out.println(fechas[i].plusDays(90).toString("E MM/dd/yyyy HH:mm:ss"));
        }

    }
}

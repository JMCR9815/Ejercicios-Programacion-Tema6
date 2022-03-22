import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        boolean bandera = false;
        for (String arguments : args) {

            LocalDate values = LocalDate.parse(arguments);

//            Year valueYear = Year.;
            if (values.isLeapYear()) {
                bandera = true;
                System.out.println("Year " + args + " is bisiesto?: " + bandera);
            } else {
                bandera = false;
                System.out.println("Year " + args + " is bisiesto?: " + bandera);
            }

        }
    }
}

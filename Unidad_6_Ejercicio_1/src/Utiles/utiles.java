package Utiles;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

public class utiles {
    public void isDigit_Letter_Other(String cadena) {

        char[] caracteres = cadena.toCharArray();
        for (int i = 0; i < caracteres.length; i++) {
            System.out.print("Caracter " + i + " : " + caracteres[i] + " ");
            if (Character.isDigit(caracteres[i])) {
                System.out.println("El caracter " + i + " es un Digito");
            } else
                if (Character.isLetter(caracteres[i])) {
                    System.out.println("El caracter " + i + " es una Letra");
                } else
                    if (!Character.isLetterOrDigit(caracteres[i])) {
                        System.out.println("El caracter " + i + " no es ni Digito ni Letra, puede ser un caracter especial.");
                    }
        }
    }

    public String[] copyOfPatron(String[] cadenas, String patron) {
        int size = 0;
        int auxiliar = 0;

        for (String cadena : cadenas) {
            if (String.valueOf(cadena).endsWith(patron)) {
                size++;
            }
        }
        String[] arrayCopy = new String[size];

        for (String cadena : cadenas) {
            if (String.valueOf(cadena).endsWith(patron)) {
                arrayCopy[auxiliar] = cadena;
                auxiliar++;
            }
        }
        return arrayCopy;
    }

    public String[] copyOfSeparators(String[] cadenas, String separadores) {
        int size = 0;
        int auxiliar = 0;
        for (String cadena : cadenas) {
            if (String.valueOf(cadena).endsWith(separadores)) {
                size++;
            }
        }
        String[] arrayCopy = new String[size];
        for (String cadena : cadenas) {
            if (String.valueOf(cadena).endsWith(separadores)) {
                arrayCopy[auxiliar] = cadena;
                auxiliar++;
            }
        }

        return arrayCopy;
    }

    public int arrayIntOrd(int[] numeros, int posicion) {
        int valorPosicion = 0;
        Arrays.sort(numeros);
        System.out.println("Array Resultado= " + Arrays.toString(numeros));
        for (int i = 0; i < numeros.length; i++) {
            if (i == posicion) {
                valorPosicion = numeros[i];
            }
        }
        return valorPosicion;
    }

    public LocalDate[] ordenarFechas(LocalDate[] fecha1) {


        Arrays.sort(fecha1);
        return fecha1;


    }

    public int fechasCoincidentes(LocalDate[] fechas, double mes, double year) {
        int contadoCoincidencias = 0;
        for (LocalDate fecha : fechas) {
            if (fecha.getMonthValue() == mes && fecha.getYear() == year) {
                System.out.println("Fecha: " + fecha);
                contadoCoincidencias++;
            }
        }
        return contadoCoincidencias;
    }

    public int arrayHoras(LocalTime[] horas, int hora) {
        int resultado = 0;
        for (LocalTime localTime : horas) {

            if (localTime.getHour() <= hora) {
                System.out.println("Hora: " + localTime);
                resultado++;
            }
        }
        return resultado;
    }
}

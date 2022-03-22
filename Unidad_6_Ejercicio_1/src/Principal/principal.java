package Principal;

import Utiles.utiles;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

public class principal {
    public static void main(String[] args) {
        utiles metodosUtiles = new utiles();
        String cadena = "hola12345/";

        //Ejecucuion Primer metodo....
        metodosUtiles.isDigit_Letter_Other(cadena);
        System.out.println();

        //Ejecucion del Segundo Metodo....
        String[] cadenas = {"Hola ", "Adios", "ABC ", "JHGF", "JIMG "};
        String patron = " ";
        String[] cadenaCopy = metodosUtiles.copyOfPatron(cadenas, patron);
        System.out.println("Array Original: " + Arrays.toString(cadenas));
        System.out.println("Array Resultado: " + Arrays.toString(cadenaCopy));
        System.out.println();

        //Ejecucion del Tercer Metodo...
        String[] cadenas2 = {"Hola", "Adios", "ABC", "JHGF", "JIMG"};
        String separator = ";";

        String[] cadenaCopy2 = metodosUtiles.copyOfSeparators(cadenas2, separator);
        System.out.println("Array Original: " + Arrays.toString(cadenas2));
        System.out.println("Array Resultado: " + Arrays.toString(cadenaCopy));
        System.out.println();

        //Ejecucion del Cuarto Metodo....
        int[] numeros = {5, 10, 7, 2, 3, 4};
        int posicion = 4;
        System.out.println("Array orifinal= " + Arrays.toString(numeros));
        int numerosResultado = metodosUtiles.arrayIntOrd(numeros, posicion);
        System.out.println("Posicion: " + numerosResultado);
        System.out.println();

        //Ejecucion Quinto Metodo....
        LocalDate[] fechas = {LocalDate.of(2014, 07, 18), LocalDate.of(2021, 06, 21), LocalDate.of(2014, 07, 13), LocalDate.of(2016, 05, 03), LocalDate.of(2014, 07, 28)};
        System.out.println("Array de fechas Original: " + Arrays.toString(fechas));
        LocalDate[] fechasOrdenadas = metodosUtiles.ordenarFechas(fechas);
        System.out.println("Array de Fechas Ordenados " + Arrays.toString(fechasOrdenadas));
        System.out.println();

        //Ejecucion Sexto Metodo....
        int coincidencias = metodosUtiles.fechasCoincidentes(fechas, 07, 2014);
        System.out.println("Numero de coincidencias Encontradas: " + coincidencias);
        System.out.println();

        //Ejecucion Septimo Metodo....
        LocalTime[] horas = {LocalTime.of(8, 20), LocalTime.of(5, 30), LocalTime.of(9, 15), LocalTime.of(3, 40), LocalTime.of(6, 50)};
        System.out.println("Array de horas : " + Arrays.toString(horas));
        int resultado = metodosUtiles.arrayHoras(horas, 7);
        System.out.println("Numero de horas anteriores al parametro introducido: " + resultado);
    }
}

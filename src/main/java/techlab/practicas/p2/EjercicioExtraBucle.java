package techlab.practicas.p2;

import java.util.Scanner;

public class EjercicioExtraBucle {
    /*
     *Se ingresas notas numericas de 0 a 10.
     * El proceso de carga finaliza cuando se detecta un numero fuera de rango(negativo o mayor de 0).
     * La computadora muestra el promedio de las notas.
     */
    public static void main(String[] args) {
        //promedio = suma numeros / cantidad de numeros sumados
        Scanner terminal = new Scanner(System.in);
        float sumaNumeros = 0;
        int cantidadNumeros = 0;
        System.out.println("Ingrese una nota valida entre 0 y 10");
        float nota = terminal.nextFloat();
        // hay que escribir una comparacion para saber si la nota esta entre 0 y 10

        while (nota >= 0 && nota <= 10) {
            sumaNumeros = sumaNumeros + nota;
            cantidadNumeros = cantidadNumeros + 1;
            System.out.println("Ingrese una nota valida entre 0 y 10");
            nota = terminal.nextFloat();
        }
        float promedio = sumaNumeros / cantidadNumeros;
        System.out.println("El promedio es: " + promedio);
        System.out.println("Se tomaron "+ cantidadNumeros + " notas");

    }

}


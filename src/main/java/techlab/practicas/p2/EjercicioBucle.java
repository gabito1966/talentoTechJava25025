package techlab.practicas.p2;


import java.util.Scanner;

public class EjercicioBucle {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int numero = consola.nextInt();
        System.out.println("Ingrese un numero: ");
        boolean contarAdelante = numero > 0;


// Arreglo para tener en cuenta los negativos
        System.out.println("BUCLE FOR");
        if (contarAdelante) {
            for (int i = 1; i <= numero; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = 1; i >= numero; i--) {
                System.out.println(i);
            }
        }
        System.out.println("BUCLE WHILE");
        if (contarAdelante) {
            int i = 1;
            while (i <= numero) {
                System.out.println(i);
                i++;
            }
        } else {
            int i = 1;
            while (i >= numero) {
                System.out.println(i);
                i--;
            }
        }
    }
}

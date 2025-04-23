package techlab.practicas.p2;

import java.util.Scanner;

public class EjercicioCursoIdioma {
    /**
     * En un colegio existe la posibilidad de elegir la materia "Lengua Extranjera"
     * entre las siguientes opciones (I)Ingles, (F)Frances, y (A)Aleman. Se ingresa
     * para cada alumno, la lengua elegida. La computadora muestra el porcentaje de
     * alumnos que eligio cada lengua
     * DATO: pueden suponer que se van a inscribir 10 estudiantes
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalAlumnos = 10;
        int ingles = 0;
        int frances = 0;
        int aleman = 0;

        for (int i = 1; i <= totalAlumnos; i++) {
            System.out.print("Ingrese la lengua elegida por el alumno " + i + " (I: Inglés, F: Francés, A: Alemán): ");
            String opcion = scanner.nextLine().toUpperCase();

            switch (opcion) {
                case "I":
                    ingles++;
                    break;
                case "F":
                    frances++;
                    break;
                case "A":
                    aleman++;
                    break;
                default:
                    System.out.println("Opción inválida. Vuelva a intentar.");
                    i--; // Repetir el mismo número de alumno
                    break;
            }
        }

        // Calcular porcentajes
        double porcentajeIngles = (ingles * 100.0) / totalAlumnos;
        double porcentajeFrances = (frances * 100.0) / totalAlumnos;
        double porcentajeAleman = (aleman * 100.0) / totalAlumnos;

        // Mostrar resultados
        System.out.println("\nPorcentajes de elección de lenguas extranjeras:");
        System.out.printf("Inglés: %.2f%%\n", porcentajeIngles);
        System.out.printf("Francés: %.2f%%\n", porcentajeFrances);
        System.out.printf("Alemán: %.2f%%\n", porcentajeAleman);

        scanner.close();
    }
}

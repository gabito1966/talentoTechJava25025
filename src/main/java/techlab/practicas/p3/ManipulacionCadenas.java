package techlab.practicas.p3;

public class ManipulacionCadenas {
    public static void main(String[] args) {
            String cadena = " té CHAi ";

            // 1. Eliminar espacios al principio y al final
            cadena = cadena.trim();

            // 2. Pasar a minúsculas y capitalizar cada palabra
            String[] palabras = cadena.toLowerCase().split(" ");
            StringBuilder formateada = new StringBuilder();

            for (String palabra : palabras) {
                if (!palabra.isEmpty()) {
                    formateada.append(Character.toUpperCase(palabra.charAt(0)));
                    formateada.append(palabra.substring(1));
                    formateada.append(" ");
                }
            }

            // Quitar el último espacio
            String resultado = formateada.toString().trim();

            // 3. Mostrar resultados
            System.out.println("Cadena formateada: " + resultado);
            System.out.println("Longitud: " + resultado.length());
            System.out.println("Primera letra: " + resultado.charAt(0));
            System.out.println("¿Contiene 'Chai'?: " + resultado.contains("Chai"));
        }
    }
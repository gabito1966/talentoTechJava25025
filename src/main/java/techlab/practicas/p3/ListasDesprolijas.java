package techlab.practicas.p3;

import java.util.ArrayList;
import java.util.List;

public class ListasDesprolijas {
    public static void main(String[] args) {
        // Crear una lista de productos con nombres desprolijos
        List<String> productos = new ArrayList<>();
        productos.add(" manzana ");
        productos.add("banana  ");
        productos.add(" CEREZA ");
        productos.add("uva");
        productos.add("PEra ");

        // Imprimir los productos originales (desprolijos)
        System.out.println("Productos originales:");
        for (String producto : productos) {
            System.out.println("\"" + producto + "\"");
        }

        // Llamar al método que formatea los nombres
        formatearProductos(productos);

        // Imprimir los productos después del formateo
        System.out.println("\nProductos después de formatear:");
        for (String producto : productos) {
            System.out.println("\"" + producto + "\"");
        }
    }

    // Método que recorre la lista y formatea cada nombre
    public static void formatearProductos(List<String> productos) {
        for (int i = 0; i < productos.size(); i++) {
            // Tomar el producto, eliminar espacios y convertir a minúsculas
            String producto = productos.get(i).trim().toLowerCase();

            // Capitalizar la primera letra de cada palabra
            String[] palabras = producto.split(" ");
            StringBuilder productoFormateado = new StringBuilder();
            for (String palabra : palabras) {
                if (!palabra.isEmpty()) {
                    productoFormateado.append(Character.toUpperCase(palabra.charAt(0)))
                            .append(palabra.substring(1))
                            .append(" ");
                }
            }

            // Eliminar el espacio extra final
            productos.set(i, productoFormateado.toString().trim());
        }
    }
}

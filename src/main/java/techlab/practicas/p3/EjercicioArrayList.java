package techlab.practicas.p3;

import java.util.ArrayList;

public class EjercicioArrayList {
    public static void main(String[] args) {
        // 1. Crear un ArrayList de productos
        ArrayList<String> productos = new ArrayList<>();

        // 2. Agregar productos al ArrayList
        productos.add("Manzana");
        productos.add("Banana");
        productos.add("Cereza");
        productos.add("Uva");
        productos.add("Pera");

        // Imprimir los productos antes de hacer cambios
        System.out.println("Productos originales:");
        for (String producto : productos) {
            System.out.println(producto);
        }

        // 3. Eliminar un producto (por ejemplo, "Banana")
        productos.remove("Banana");

        // 4. Verificar si "Cereza" existe en la lista
        boolean existeCereza = productos.contains("Cereza");
        System.out.println("\n¿La 'Cereza' existe en la lista? " + existeCereza);

        // 5. Imprimir la lista final de productos
        System.out.println("\nLista final de productos:");
        for (String producto : productos) {
            System.out.println(producto);
        }
    }
}

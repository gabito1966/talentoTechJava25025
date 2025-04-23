package techlab.practicas.p3;

public class Array {
    public static void main(String[] args) {
        // Crear un array de 5 productos
        String[] productos = {"Manzana", "Banana", "Cereza", "Uva", "Pera"};

        // Imprimir los elementos del array
        System.out.println("Productos disponibles:");
        for (String producto : productos) {
            System.out.println(producto);
        }

        // Intentar agregar un sexto producto (Esto no es posible directamente con un array fijo)
        // Array tiene un tamaño fijo, por lo que se produce un error de compilación si intentamos agregarlo.
        // Lo que podemos hacer es crear un nuevo array con un tamaño mayor y copiar los elementos.

        // Crear un nuevo array con un tamaño mayor
        String[] productosAmpliados = new String[productos.length + 1];

        // Copiar los productos existentes al nuevo array
        System.arraycopy(productos, 0, productosAmpliados, 0, productos.length);

        // Agregar el sexto producto
        productosAmpliados[productosAmpliados.length - 1] = "Kiwi";

        // Imprimir los elementos del array ampliado
        System.out.println("\nProductos después de agregar un sexto:");
        for (String producto : productosAmpliados) {
            System.out.println(producto);
        }
    }
}
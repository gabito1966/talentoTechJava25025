package techlab.proyecto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        productosIniciales(productos);

        Scanner entrada = new Scanner(System.in);
        int opcionUsuario;

        do {
            mostrarMenu();
            while (!entrada.hasNextInt()) {
                System.out.println("Por favor, ingrese un número válido.");
                entrada.next(); // descarta entrada no numérica
            }
            opcionUsuario = entrada.nextInt();
            entrada.nextLine(); // consumir salto de línea

            switch (opcionUsuario) {
                case 1 -> agregarProducto(productos, entrada);
                case 2 -> listarProductos(productos);
                case 3 -> buscarProducto(productos, entrada);
                case 4 -> eliminarProducto(productos, entrada);
                case 5 -> System.out.println("Crear un pedido... (funcionalidad pendiente)");
                case 6 -> System.out.println("Listar pedidos... (funcionalidad pendiente)");
                case 7 -> System.out.println("Gracias por visitar nuestra tienda virtual!");
                default -> System.out.println("Opción incorrecta");
            }
        } while (opcionUsuario != 7);

        entrada.close();
    }

    private static void mostrarMenu() {
        System.out.println("""
            \nMenu principal:
              1) Agregar producto
              2) Listar productos
              3) Buscar/Actualizar producto
              4) Eliminar producto
              5) Crear un pedido
              6) Listar pedidos
              7) Salir
            Elija una opción:
            """);
    }

    private static void agregarProducto(ArrayList<Producto> productos, Scanner entrada) {
        System.out.println("Ingrese el nombre del producto:");
        String nombre = entrada.nextLine();

        System.out.printf("Ingrese el precio de %s: ", nombre);
        double precio = leerDouble(entrada);

        System.out.printf("Ingrese el stock de %s: ", nombre);
        int stock = leerInt(entrada);

        productos.add(new Producto(nombre, precio, stock));
        System.out.println("☣ Producto cargado exitosamente! ☣");
    }

    private static void listarProductos(ArrayList<Producto> productos) {
        if (productos.isEmpty()) {
            System.out.println("No hay productos todavía :(");
        } else {
            for (Producto producto : productos) {
                System.out.println("-------------------------");
                producto.mostrarInfo();
                System.out.println("-------------------------");
            }
        }
    }

    private static void buscarProducto(ArrayList<Producto> productos, Scanner entrada) {
        System.out.println("Ingrese el nombre del producto a buscar:");
        String nombre = entrada.nextLine();

        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                producto.mostrarInfo();
                System.out.println("¿Desea actualizar este producto? (s/n)");
                if (entrada.nextLine().equalsIgnoreCase("s")) {
                    System.out.print("Nuevo precio: ");
                    producto.setPrecio(leerDouble(entrada));

                    System.out.print("Nuevo stock: ");
                    producto.setStock(leerInt(entrada));

                    System.out.println("Producto actualizado correctamente.");
                }
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }

    private static void eliminarProducto(ArrayList<Producto> productos, Scanner entrada) {
        System.out.println("Ingrese el nombre del producto a eliminar:");
        String nombre = entrada.nextLine();

        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                productos.remove(producto);
                System.out.println("Producto eliminado exitosamente.");
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }

    private static double leerDouble(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.println("Por favor, ingrese un número válido.");
            scanner.next(); // descarta entrada no válida
        }
        double valor = scanner.nextDouble();
        scanner.nextLine(); // limpiar buffer
        return valor;
    }

    private static int leerInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, ingrese un número entero válido.");
            scanner.next();
        }
        int valor = scanner.nextInt();
        scanner.nextLine();
        return valor;
    }

    private static void productosIniciales(ArrayList<Producto> productos) {
        productos.add(new Producto("Monitor LED 24\"", 1200.00, 15));
        productos.add(new Producto("Teclado mecánico RGB", 450.00, 25));
        productos.add(new Producto("Mouse inalámbrico", 300.00, 30));
        productos.add(new Producto("Memoria RAM 8GB DDR4", 350.00, 20));
        productos.add(new Producto("Disco SSD 500GB", 700.00, 18));
        productos.add(new Producto("Placa madre ATX", 950.00, 12));
        productos.add(new Producto("Procesador Intel i5", 1300.00, 10));
        productos.add(new Producto("Fuente de poder 600W", 600.00, 14));
        productos.add(new Producto("Gabinete con RGB", 800.00, 10));
        productos.add(new Producto("Cooler CPU", 250.00, 22));
        productos.add(new Producto("Disco duro 1TB", 500.00, 16));
        productos.add(new Producto("Webcam HD", 200.00, 30));
        productos.add(new Producto("Parlantes estéreo", 150.00, 28));
        productos.add(new Producto("Impresora multifunción", 900.00, 8));
        productos.add(new Producto("Router Wi-Fi", 350.00, 20));
        productos.add(new Producto("Adaptador USB Wi-Fi", 180.00, 35));
        productos.add(new Producto("Cable HDMI 2m", 50.00, 50));
        productos.add(new Producto("Mouse pad gamer", 120.00, 40));
        productos.add(new Producto("Hub USB 4 puertos", 100.00, 25));
        productos.add(new Producto("Limpieza para PC (kit)", 180.00, 12));
    }
}
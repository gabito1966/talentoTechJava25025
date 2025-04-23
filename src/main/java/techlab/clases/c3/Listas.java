package techlab.clases.c3;

import java.util.ArrayList;
import java.util.Arrays;

public class Listas {
    public static void main(String[] args) {
        //Listas en Java
        // String
        String nombre = "talento tech";

        System.out.println(nombre.charAt(0));// "t"
        System.out.println(nombre.charAt(1));// "a"
        System.out.println(nombre.charAt(2));// "l"
        System.out.println(nombre.charAt(3));// "e"
        int ultimoIndice = nombre.length()-1;
        System.out.println(nombre.charAt(ultimoIndice)); // "h"
        // Arrays
        String[] letrasArray = {"t","a","l","e","n","t","o",};
        String letra1 = letrasArray[0];
        String letra2 = letrasArray[1];
        String letra3 = letrasArray[2];
        String letra4 = letrasArray[3];
        int ultimoIndiceArray = letrasArray.length-1;
        String ultimaLetra = letrasArray[ultimoIndiceArray];
        // ArrayList
        ArrayList<String> letras = new ArrayList<>();
        // transformaciones para que los datos sean compatibles
        letras.addAll(Arrays.stream(letrasArray).toList());
        System.out.println(letras.get(0));
        System.out.println(letras.get(1));
        System.out.println(letras.get(2));
        int ultimoIndiceList = letras.size()-1;
        System.out.println(letras.get(ultimoIndiceList));

        letras.add(" ");
        letras.add("t");
        letras.add("e");
        letras.add("c");
        letras.add("h");
        System.out.println(letras);



    }
}

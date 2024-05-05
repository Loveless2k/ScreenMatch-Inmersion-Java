package util;

import java.util.Scanner;

public class InputHelper {
    private static final Scanner scanner = new Scanner(System.in);

    public static int leerEntero(String mensaje) {
        System.out.println(mensaje);
        while (!scanner.hasNextInt()) {
            scanner.nextLine(); // clear the invalid input
            System.out.println("Por favor, ingrese un número válido.");
        }
        int valor = scanner.nextInt();
        scanner.nextLine(); // consume the newline after the integer input
        return valor;
    }

    public static double leerDouble(String mensaje) {
        System.out.println(mensaje);
        while (!scanner.hasNextDouble()) {
            scanner.nextLine(); // clear the invalid input
            System.out.println("Por favor, ingrese un número válido.");
        }
        double valor = scanner.nextDouble();
        scanner.nextLine(); // consume the newline after the double input
        return valor;
    }

    public static String leerCadena(String mensaje) {
        System.out.println(mensaje);
        String valor = scanner.nextLine(); // reads the whole line including spaces
        return valor;
    }

    // Método auxiliar para manejar errores de entrada y simplificar la lógica
    private static void manejarErrorEntrada(String error) {
        scanner.nextLine(); // clear the invalid input
        System.out.println(error);
    }
}

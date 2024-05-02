import modelo.Pelicula;
import java.util.Scanner;

public class Principal {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        muestraElMenu();
    }

    public static void muestraElMenu(){
        int opcion = 0;

        while (opcion != 9) {
            mostrarMenu();
            opcion = leerEntero("Seleccione una opción: ");

            switch (opcion) {
                case 1:
                    registrarPelicula();
                    break;
                case 9:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
                    break;
            }
        }
    }

    private static void mostrarMenu() {
        String menu = """
                Bienvenido(a) a Screenmatch
                1) Registrar nueva película
                2) Registrar nueva serie
                
                9) Salir
                """;
        System.out.println(menu);
    }

    private static void registrarPelicula() {
        System.out.println("Ingrese el nombre de la película:");
        String nombre = scanner.nextLine();
        int fechaDeLanzamiento = leerEntero("Ingrese el año de lanzamiento de la película:");
        int duracionEnMinutos = leerEntero("Ingrese la duración en minutos de la película:");

        Pelicula pelicula = new Pelicula();
        pelicula.setNombre(nombre);
        pelicula.setAnioLanzamiento(fechaDeLanzamiento);
        pelicula.setDuracionEnMinutos(duracionEnMinutos);
        pelicula.muestraFichaTecnica();
    }

    private static int leerEntero(String mensaje) {
        System.out.println(mensaje);
        while (!scanner.hasNextInt()) {
            scanner.nextLine(); // clear the invalid input
            System.out.println("Por favor, ingrese un número válido.");
        }
        int valor = scanner.nextInt();
        scanner.nextLine(); // consume the newline
        return valor;
    }
}

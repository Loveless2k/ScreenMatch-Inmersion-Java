package negocio;

import modelo.Pelicula;
import modelo.Serie;
import modelo.Titulo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    private static final Scanner scanner = new Scanner(System.in);
    private static List<Titulo> contenido = new ArrayList<Titulo>();

    public static void main(String[] args) {
        muestraElMenu();
    }

    public static void muestraElMenu(){
        int opcion = 0;

        while (opcion != 9) {
            mostrarMenu();
            opcion = leerEntero("Seleccione una opción: ");

            switch (opcion) {
                case 1 -> registrarPelicula();
                case 2 -> registrarSerie();
                case 3 -> calculadoraDeTiempo();
                case 9 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida, por favor intente de nuevo.");
            }
        }
    }

    private static void mostrarMenu() {
        String menu = """
                Bienvenido(a) a Screenmatch
                1) Registrar nueva película
                2) Registrar nueva serie
                3) Calculadora de Tiempo
                
                9) Salir
                """;
        System.out.println(menu);
    }

    private static void registrarPelicula() {
        System.out.println("Ingrese el nombre de la película:");
        String nombre = scanner.nextLine();
        int fechaDeLanzamiento = leerEntero("Ingrese el año de lanzamiento de la película:");
        int duracionEnMinutos = leerEntero("Ingrese la duración en minutos de la película:");
        System.out.println("Ingrese el nombre del director de la película:");
        String director = scanner.nextLine();

        Pelicula pelicula = new Pelicula();
        pelicula.setNombre(nombre);
        pelicula.setAnioLanzamiento(fechaDeLanzamiento);
        pelicula.setDuracionEnMinutos(duracionEnMinutos);
        pelicula.setDirector(director);
        pelicula.mostrarFichaTecnica();

        contenido.add(pelicula);
    }

    private static void registrarSerie(){
        System.out.println("Ingrese el nombre de la serie:");
        String nombre = scanner.nextLine();

        int anhioLanzamiento = leerEntero("Ingrese el anhio de lanzamiento");
        int numeroDeTemporadas = leerEntero("Ingrese el número de temporadas de la serie:");
        int episodiosPorTemporada = leerEntero("Ingrese los episodios por temporada de la serie:");
        int duracionEnMinutosPorEpisodio = leerEntero("Ingrese la duración en minutos por episodio:");

        Serie serie = new Serie();
        serie.setNombre(nombre);
        serie.setAnioLanzamiento(anhioLanzamiento);
        serie.setTemporadas(numeroDeTemporadas);
        serie.setEpisodiosPorTemporada(episodiosPorTemporada);
        serie.setDuracionEnMinutosPorEpisodio(duracionEnMinutosPorEpisodio);
        serie.mostrarFichaTecnica();

        contenido.add(serie);
    }

    private static void calculadoraDeTiempo(){
        if (contenido.isEmpty()) {
            throw new IllegalArgumentException("No hay elementos en el stream.");
        }

        System.out.println("Las películas y series consideradas para este cálculo son: ");

        for (Titulo titulo : contenido) {
            System.out.println((contenido.indexOf(titulo) + 1) + ": " + titulo.getNombre());
        }

        System.out.println("El tiempo total de visualización en la maratón es de: " + Titulo.getDuracionEnHorasYMinutos(Titulo.getDuracionMaraton()));
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

    public List<Titulo> getContenido() {
        return contenido;
    }

    public void setContenido(List<Titulo> contenido) {
        this.contenido = contenido;
    }
}

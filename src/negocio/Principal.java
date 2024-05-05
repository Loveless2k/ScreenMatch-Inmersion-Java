package negocio;

import modelo.Pelicula;
import modelo.Serie;
import modelo.Titulo;
import util.InputHelper;
import util.RegistroMedia;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    private static List<Titulo> contenido = new ArrayList<>();
    private static int sumaTiempoMaraton;
    private static final String NOMBRE = "A) Ingrese el nombre de %s:";
    private static final String FECHA_LANZAMIENTO = "B) Ingrese su año de lanzamiento:";
    private static final String EVALUACION = "C) Ingrese la evaluación de %s: ";
    private static final String DURACION = "D) Ingrese su duración, en minutos:";
    private static final String DIRECTOR = "A) Ingrese el nombre del director:";
    private static final String TEMPORADAS = "D) Ingrese el número de temporadas:";
    private static final String EPISODIOS_POR_TEMPORADA = "E) Ingrese el número de episodios por temporada:";
    private static final String DURACION_POR_EPISODIO = "F) Ingrese el número de minutos por episodio:";

    public static void muestraElMenu(){
        int opcion = 0;

        while (opcion != 9) {
            mostrarMenu();
            opcion = InputHelper.leerEntero("Seleccione una opción: ");

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
        Pelicula pelicula = RegistroMedia.formularioDeRegistroPelicula();
        System.out.println("¡Pelicula registrada con éxito!");
        pelicula.mostrarFichaTecnica();
        contenido.add(pelicula);
    }

    private static void registrarSerie(){
        Serie serie = RegistroMedia.formularioDeRegistroSerie();
        System.out.println("¡Serie registrada con éxito!");
        serie.mostrarFichaTecnica();
        contenido.add(serie);
    }

    private static void calculadoraDeTiempo(){
        if (contenido.isEmpty()) {
            throw new IllegalArgumentException("No hay elementos en el stream.");
        }

        sumaTiempoMaraton = 0;
        System.out.println("Las películas y series consideradas para este cálculo son: ");

        contenido.forEach(titulo -> {
            System.out.println((contenido.indexOf(titulo) + 1) + ": " + titulo.getNombre() + " cuyo tiempo total es de "
                    + titulo.getDuracionEnMinutos() + " minutos");
            sumaTiempoMaraton += titulo.getDuracionEnMinutos();
        });

        System.out.println("El tiempo total de visualización en la maratón es de: "
                + Titulo.getDuracionEnHorasYMinutos(sumaTiempoMaraton));
    }
}

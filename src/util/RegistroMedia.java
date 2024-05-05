package util;

import modelo.Pelicula;
import modelo.Serie;

public class RegistroMedia {
    private static final String NOMBRE = "A) Ingrese el nombre de %s:";
    private static final String FECHA_LANZAMIENTO = "B) Ingrese su año de lanzamiento:";
    private static final String EVALUACION = "C) Ingrese la evaluación de %s: ";

    private static class InformacionBasica {
        String nombre;
        int fechaDeLanzamiento;
        double evaluacion;

        InformacionBasica(String nombre, int fechaDeLanzamiento, double evaluacion) {
            this.nombre = nombre;
            this.fechaDeLanzamiento = fechaDeLanzamiento;
            this.evaluacion = evaluacion;
        }
    }

    private static InformacionBasica obtenerInformacionBasica(String tipoMedia) {
        System.out.println("Por favor, complete el siguiente formulario \n");
        String nombre = InputHelper.leerCadena(String.format(NOMBRE, tipoMedia));
        int fechaDeLanzamiento = InputHelper.leerEntero(FECHA_LANZAMIENTO);
        double evaluacion = InputHelper.leerDouble(String.format(EVALUACION, tipoMedia));
        return new InformacionBasica(nombre, fechaDeLanzamiento, evaluacion);
    }

    public static Pelicula formularioDeRegistroPelicula() {
        InformacionBasica info = obtenerInformacionBasica("de la película");
        int duracionEnMinutos = InputHelper.leerEntero("D) Ingrese su duración, en minutos:");
        String director = InputHelper.leerCadena("E) Ingrese el nombre del director:");

        return new Pelicula(info.nombre, info.fechaDeLanzamiento, info.evaluacion, false, duracionEnMinutos, director);
    }

    public static Serie formularioDeRegistroSerie() {
        InformacionBasica info = obtenerInformacionBasica("de la serie");
        int temporadas = InputHelper.leerEntero("D) Ingrese el número de temporadas:");
        int episodiosPorTemporada = InputHelper.leerEntero("E) Ingrese el número de episodios por temporada:");
        int duracionEnMinutosPorEpisodio = InputHelper.leerEntero("F) Ingrese el número de minutos por episodio:");

        return new Serie(info.nombre, info.fechaDeLanzamiento, info.evaluacion, false, temporadas, episodiosPorTemporada, duracionEnMinutosPorEpisodio);
    }
}
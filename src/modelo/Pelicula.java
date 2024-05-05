package modelo;

/**
 * Clase que representa una película dentro de una plataforma de streaming.
 * Almacena detalles relevantes de la película y provee métodos para gestionar y mostrar su información.
 */
public class Pelicula extends Titulo{
    private String director;

    public Pelicula(String nombre, int anhioLanzamiento, double evaluacion, boolean incluidoEnPlanBasico,
                    int duracionEnMinutos, String director){
        super(nombre, anhioLanzamiento, evaluacion, incluidoEnPlanBasico, duracionEnMinutos);
        this.director = director;
    }

    @Override
    public void mostrarFichaTecnica() {
        super.mostrarFichaTecnica();
        System.out.println("Director: " + director);
    }
}

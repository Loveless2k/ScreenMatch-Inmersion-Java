package modelo;

/**
 * Clase que representa una película dentro de una plataforma de streaming.
 * Almacena detalles relevantes de la película y provee métodos para gestionar y mostrar su información.
 */
public class Pelicula extends Titulo{
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public void mostrarFichaTecnica() {
        super.mostrarFichaTecnica();
        System.out.println("Director: " + director);
    }
}

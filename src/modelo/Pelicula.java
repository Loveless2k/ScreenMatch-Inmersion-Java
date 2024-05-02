package modelo;

/**
 * Clase que representa una película dentro de una plataforma de streaming.
 * Almacena detalles relevantes de la película y provee métodos para gestionar y mostrar su información.
 */
public class Pelicula {
    private String nombre;
    private int anioLanzamiento;  // Cambiado de 'fechaDeLanzamiento' a 'anioLanzamiento' para claridad
    private double evaluacion;
    private boolean incluidoEnPlanBasico;  // Refinado nombre de variable para mejorar legibilidad
    private String sinopsis;
    private int duracionEnMinutos;  // Refinado nombre de variable para mejorar legibilidad

    // Getters y setters con documentación básica de cada función.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public void setAnioLanzamiento(int anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }

    public double getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(double evaluacion) {
        this.evaluacion = evaluacion;
    }

    public boolean isIncluidoEnPlanBasico() {
        return incluidoEnPlanBasico;
    }

    public void setIncluidoEnPlanBasico(boolean incluidoEnPlanBasico) {
        this.incluidoEnPlanBasico = incluidoEnPlanBasico;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    /**
     * Imprime la ficha técnica de la película con los detalles más relevantes.
     */
    public void muestraFichaTecnica() {
        System.out.println("****FICHA TÉCNICA****");
        System.out.println("Nombre del título: " + nombre);
        System.out.println("Año de Lanzamiento: " + anioLanzamiento);
        System.out.println("Duración: " + duracionEnMinutos + " minutos");
    }
}

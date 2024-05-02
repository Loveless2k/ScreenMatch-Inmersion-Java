package modelo;

/**
 * Clase base para modelar títulos de contenido multimedia, como películas o series.
 * Almacena información común como nombre, fecha de lanzamiento, evaluación, etc.
 */
public class Titulo {
    private String nombre;
    private int anioLanzamiento;  // Cambiado de 'fechaDeLanzamiento' a 'anioLanzamiento' para mayor claridad
    private double evaluacion;
    private boolean incluidoEnPlanBasico;  // Simplificado para mejorar la legibilidad
    private String sinopsis;
    private int duracionEnMinutos;  // Simplificado para mejorar la legibilidad

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
     * Imprime la ficha técnica del título, mostrando detalles clave.
     */
    public void muestraFichaTecnica() {
        System.out.println("****FICHA TÉCNICA****");
        System.out.println("Nombre del título: " + nombre);
        System.out.println("Año de Lanzamiento: " + anioLanzamiento);
        System.out.println("Tiempo de duración: " + duracionEnMinutos + " minutos");
    }
}

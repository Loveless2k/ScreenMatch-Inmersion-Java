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
    private int duracionEnMinutos;  // Simplificado para mejorar la legibilidad

    public Titulo(String nombre, int anhioLanzamiento, double evaluacion, boolean isIncluidoEnPlanBasico, int duracionEnMinutos){
        this.nombre = nombre;
        this.anioLanzamiento = anhioLanzamiento;
        this.evaluacion = evaluacion;
        this.incluidoEnPlanBasico = isIncluidoEnPlanBasico;
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public double getEvaluacion() {
        return evaluacion;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public String getDuracionEnHorasYMinutos(){
        return String.format("%d Horas y %d minutos", getDuracionEnMinutos() / 60, getDuracionEnMinutos() % 60);
    }

    public static String getDuracionEnHorasYMinutos(int duraciónEnMinutos){
        return String.format("%d Horas y %d minutos", duraciónEnMinutos / 60, duraciónEnMinutos % 60);
    }

    /**
     * Imprime la ficha técnica del título, mostrando detalles clave.
     */
    public void mostrarFichaTecnica() {
        System.out.println("****FICHA TÉCNICA****");
        System.out.println("Nombre del título: " + getNombre());
        System.out.println("Año de Lanzamiento: " + getAnioLanzamiento());
        System.out.println("Evaluación: " + getEvaluacion());
        System.out.println("Tiempo de duración: " + getDuracionEnMinutos() + " minutos");
    }
}

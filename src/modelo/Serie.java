package modelo;

/**
 * Clase Serie que extiende de Titulo para modelar las características específicas de series de televisión.
 * Incluye detalles sobre las temporadas, episodios por temporada y duración de cada episodio.
 */
public class Serie extends Titulo {
    private int temporadas;
    private int episodiosPorTemporada;
    private int duracionEnMinutosPorEpisodio;

    public Serie(String nombre, int fechaLanzamiento, double evaluacion, boolean inluidoEnPlanBase, int temporadas, int episodiosPorTemporada, int duracionEnMinutosPorEpisodio){
        super(nombre, fechaLanzamiento, evaluacion, inluidoEnPlanBase, (duracionEnMinutosPorEpisodio * episodiosPorTemporada * temporadas));
        this.temporadas = temporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
        this.duracionEnMinutosPorEpisodio = duracionEnMinutosPorEpisodio;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public int getDuracionEnMinutosPorEpisodio() {
        return duracionEnMinutosPorEpisodio;
    }

    @Override
    public void mostrarFichaTecnica() {
        super.mostrarFichaTecnica();
        System.out.println("Número de temporadas: " + getTemporadas());
        System.out.println("Episodios por temporada: " + getEpisodiosPorTemporada());
        System.out.println("Duración por episodio: " + getDuracionEnMinutosPorEpisodio() + " minutos");
        System.out.println("Duración total de la serie: " + getDuracionEnHorasYMinutos());
    }
}

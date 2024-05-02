package modelo;

/**
 * Clase Serie que extiende de Titulo para modelar las características específicas de series de televisión.
 * Incluye detalles sobre las temporadas, episodios por temporada y duración de cada episodio.
 */
public class Serie extends Titulo {
    private int temporadas;
    private int episodiosPorTemporada;
    private int duracionEnMinutosPorEpisodio;

    /**
     * Calcula y devuelve la duración total de todos los episodios de la serie en minutos.
     * @return duración total en minutos
     */
    @Override
    public int getDuracionEnMinutos() {
        return duracionEnMinutosPorEpisodio * episodiosPorTemporada * temporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    /**
     * Establece el número de temporadas de la serie. Se espera un número no negativo.
     * @param temporadas número de temporadas de la serie
     */
    public void setTemporadas(int temporadas) {
        if (temporadas >= 0) {
            this.temporadas = temporadas;
        } else {
            throw new IllegalArgumentException("El número de temporadas no puede ser negativo.");
        }
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    /**
     * Establece el número de episodios por temporada. Se espera un número no negativo.
     * @param episodiosPorTemporada número de episodios por temporada
     */
    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        if (episodiosPorTemporada >= 0) {
            this.episodiosPorTemporada = episodiosPorTemporada;
        } else {
            throw new IllegalArgumentException("El número de episodios por temporada no puede ser negativo.");
        }
    }

    public int getDuracionEnMinutosPorEpisodio() {
        return duracionEnMinutosPorEpisodio;
    }

    /**
     * Establece la duración en minutos de cada episodio. Se espera un número no negativo.
     * @param duracionEnMinutosPorEpisodio duración de un episodio en minutos
     */
    public void setDuracionEnMinutosPorEpisodio(int duracionEnMinutosPorEpisodio) {
        if (duracionEnMinutosPorEpisodio >= 0) {
            this.duracionEnMinutosPorEpisodio = duracionEnMinutosPorEpisodio;
        } else {
            throw new IllegalArgumentException("La duración de los episodios no puede ser negativa.");
        }
    }
}

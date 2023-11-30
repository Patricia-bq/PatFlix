package patyflix.modelos;

import patflyx.calculos.Avalia;

public class Serie extends Titulo implements Avalia {
    public int temporadas;

    public int episodios;

    public int duracaoPorEpisodio;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodios() { return episodios; }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getDuracaoPorEpisodio() {
        return duracaoPorEpisodio;
    }

    public void setDuracaoPorEpisodio(int duracaoPorEpisodio) {
        this.duracaoPorEpisodio = duracaoPorEpisodio;
    }




    @Override
    public int getDuracao() {
        return temporadas * episodios * duracaoPorEpisodio;
    }

    @Override
    public int getAvaliacao() {
        return (int) (mediaAvaliacoes() / temporadas);
        }
}

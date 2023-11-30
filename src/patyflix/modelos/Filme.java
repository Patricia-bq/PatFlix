package patyflix.modelos;

import patflyx.calculos.Avalia;

public class Filme extends Titulo implements Avalia {

    @Override
    public int getAvaliacao() {
        return (int) (mediaAvaliacoes() / 2);
    }
}



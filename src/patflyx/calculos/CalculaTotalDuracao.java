package patflyx.calculos;
import patyflix.modelos.Titulo;
public class CalculaTotalDuracao {
    private int duracaoTotal;

    public int getDuracaoTotal() {
        return duracaoTotal;
    }

    public void inclui (Titulo titulo){
        duracaoTotal += titulo.getDuracao();
    }
}

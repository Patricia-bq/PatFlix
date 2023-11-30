import patflyx.calculos.CalculaTotalDuracao;
import patflyx.calculos.Recomendacao;
import patyflix.modelos.Filme;
import patyflix.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.setNome("Garota Exemplar");
        filme1.setAnoLancamento(2014);
        filme1.setDuracao(120);
        filme1.setIndicacao(14);

        filme1.exibeFichaTecnica();
        filme1.avalia(5);
        filme1.avalia(2);

        CalculaTotalDuracao calculadora = new CalculaTotalDuracao();

        System.out.println("Média avaliações: " + filme1.mediaAvaliacoes());
        System.out.println("Total de avalições:" + filme1.getTotalAvaliacao());

        Recomendacao recomendamos = new Recomendacao();
        recomendamos.filtra(filme1);
    }
}
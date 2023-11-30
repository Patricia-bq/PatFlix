package patyflix.modelos;

public class Titulo {

    private String nome;
    private int anoLancamento;
    private int indicacao;
    private boolean incluidoPlano;

    private int duracao;
    private double avaliacao;
    private int totalAvaliacao;

    public int getTotalAvaliacao() {
        return totalAvaliacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setIndicacao(int indicacao) {
        this.indicacao = indicacao;
    }

    public void setIncluidoPlano(boolean incluidoPlano) {
        this.incluidoPlano = incluidoPlano;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void exibeFichaTecnica() {
        System.out.println("Filme: " + nome);
        System.out.println("Lançamento: " + anoLancamento);
        System.out.println("Indicação: " + indicacao);
        System.out.println("Duração em minutos: " + duracao);
        System.out.println("-----------------------");
    }

    public void avalia(double nota) {
        avaliacao += nota;
        totalAvaliacao++;
    }

    public double mediaAvaliacoes() {
        return avaliacao / totalAvaliacao;
    }
}

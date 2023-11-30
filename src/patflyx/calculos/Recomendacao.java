package patflyx.calculos;

public class Recomendacao {
    private String recomenda;

    public void filtra (Avalia avalia){
        if (avalia.getAvaliacao() >= 50) {
            System.out.println("Está entre os preferidos!");
        }else {
            System.out.println("Conheça também este titulo!");
        }
    }
}

package Abstracao;

public abstract class Forma {

    private String Cor;

    public Forma() {

    }
    public abstract void calculaArea();

    public String getCor() {
        return Cor;
    }

    public void setCor(String cor) {
        Cor = cor;
    }
}

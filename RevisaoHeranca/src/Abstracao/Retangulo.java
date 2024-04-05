package Abstracao;

public class Retangulo extends Forma{

    public Retangulo(String cor) {
        this.setCor(cor);
    }

    @Override
    public void calculaArea() {
        System.out.println("Área = Base vezes Altura");
    }
}

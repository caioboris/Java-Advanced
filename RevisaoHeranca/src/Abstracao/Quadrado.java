package Abstracao;

public class Quadrado extends Forma {

    public Quadrado(String cor) {
        this.setCor(cor);
    }

    @Override
    public void calculaArea() {
        System.out.println("Área = Lado ao quadrado");
    }
}

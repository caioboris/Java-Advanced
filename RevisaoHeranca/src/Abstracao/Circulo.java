package Abstracao;

public class Circulo extends Forma {

    public Circulo(String cor) {
        this.setCor(cor);
    }

    @Override
    public void calculaArea() {
        System.out.println("Área = PI vezes raio ao quadrado");
    }
}

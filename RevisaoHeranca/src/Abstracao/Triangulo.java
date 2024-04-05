package Abstracao;

public class Triangulo extends Forma{

    public Triangulo(String cor) {
        this.setCor(cor);
    }

    @Override
    public void calculaArea() {
        System.out.println("Área = Base vezes altura dividido por 2");
    }
}

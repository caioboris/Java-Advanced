package Abstracao;

public class Main {

    public static void main(String[] args) {

        Quadrado q = new Quadrado("vermelho");
        Triangulo t = new Triangulo("verde");
        Retangulo r = new Retangulo("cinza");
        Circulo c = new Circulo("azul");

        q.calculaArea();
        t.calculaArea();
        r.calculaArea();
        c.calculaArea();
    }
}

package Heranca;

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("Volkswagen", "Jetta GLI", 250000.0);
        Moto moto = new Moto("Honda", "PCX", 35000.0);
        Caminhao caminhao = new Caminhao("Volvo", "L400", 420000.0);

        System.out.println(carro.toString() + "\n" + moto.toString() + "\n" + caminhao.toString());

    }
}
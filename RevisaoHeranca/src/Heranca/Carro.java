package Heranca;

public class Carro extends Veiculo{
    public Carro(String montadora, String modelo, double preco) {
        super(montadora, modelo, preco);
        this.setPreco(getPreco() * 1);
    }
}

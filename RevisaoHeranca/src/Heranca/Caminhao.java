package Heranca;

public class Caminhao extends Veiculo{
    public Caminhao(String montadora, String modelo, double preco) {
        super(montadora, modelo, preco);
        this.setPreco(getPreco() * 2);
    }
}

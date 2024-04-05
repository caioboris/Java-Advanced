package Heranca;

public class Moto extends Veiculo{
    public Moto(String montadora, String modelo, double preco) {
        super(montadora, modelo, preco);
        this.setPreco(getPreco() * 0.5);
    }
}

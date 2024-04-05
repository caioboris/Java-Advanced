package Heranca;

public class Veiculo {
    private String montadora;
    private String modelo;
    private double preco;

    public Veiculo(String montadora, String modelo, double preco) {
        this.montadora = montadora;
        this.modelo = modelo;
        this.preco = preco;
    }

    public String getMontadora() {
        return montadora;
    }

    public void setMontadora(String montadora) {
        this.montadora = montadora;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Heranca.Veiculo{" +
                "montadora='" + montadora + '\'' +
                ", modelo='" + modelo + '\'' +
                ", preco=" + preco +
                '}';
    }
}

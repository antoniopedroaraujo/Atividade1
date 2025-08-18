package veiculos;

public class Carro implements Veiculo {
    String placa;
    String cor;
    long quilometragem;
    double valorEmReais;

    public Carro(String placa, String cor, long quilometragem, double valorEmReais) {
        this.placa = placa;
        this.cor = cor;
        this.quilometragem = quilometragem;
        this.valorEmReais = valorEmReais;
    }

    @Override
    public String mostrarDados() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "--------------------\n Carro\n--------------------" +
                "\n placa='" + placa + '\'' +
                "\n cor='" + cor + '\'' +
                "\n Km=" + quilometragem +
                "\n Preco(R$)=" + valorEmReais +
                "\n--------------------";
    }
}

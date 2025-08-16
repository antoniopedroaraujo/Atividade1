package veiculos;

public class Onibus implements Veiculo {
    String placa;
    String cor;
    long quilometragem;
    double valorEmReais;

    public Onibus(String placa, String cor, long quilometragem, double valorEmReais) {
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
        return "Onibus{" +
                "placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", quilometragem=" + quilometragem +
                ", valorEmReais=" + valorEmReais +
                '}';
    }
}

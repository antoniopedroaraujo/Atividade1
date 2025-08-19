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
        return "--------------------\n Onibus\n--------------------" +
                "\n placa='" + placa + '\'' +
                "\n cor='" + cor + '\'' +
                "\n quilometragem=" + quilometragem +
                "\n valorEmReais=" + valorEmReais +
                "\n--------------------";
    }
}

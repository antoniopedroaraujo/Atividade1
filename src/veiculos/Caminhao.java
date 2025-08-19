package veiculos;

public class Caminhao implements Veiculo {

    private String placa;
    private String cor;
    private long quilometragem;
    private double valorEmReais;

    public Caminhao(String placa, String cor, long quilometragem, double valorEmReais) {
        this.placa = placa;
        this.cor = cor;
        this.quilometragem = quilometragem;
        this.valorEmReais = valorEmReais;
    }

    @Override
    public String mostrarDados() {
        return "--------------------\n Caminhao\n--------------------" +
                "\n placa='" + placa + '\'' +
                "\n cor='" + cor + '\'' +
                "\n quilometragem=" + quilometragem +
                "\n valorEmReais=" + valorEmReais +
                "\n--------------------\n";
    }
}


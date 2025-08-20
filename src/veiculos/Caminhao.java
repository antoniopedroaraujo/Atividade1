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
                "\n placa=' " + placa + '\'' +
                "\n cor=' " + cor + '\'' +
                "\n quilometragem= " + quilometragem +
                "\n valorEmReais= " + valorEmReais +
                "\n--------------------\n";
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public long getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(long quilometragem) {
        this.quilometragem = quilometragem;
    }

    public double getValorEmReais() {
        return valorEmReais;
    }

    public void setValorEmReais(double valorEmReais) {
        this.valorEmReais = valorEmReais;
    }
}

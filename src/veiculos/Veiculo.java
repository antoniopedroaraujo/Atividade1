package veiculos;

public interface Veiculo {

    String placa = "";
    String cor = "";
    long quilometragem = 0;
    double valorEmReais = 0.0;

    String mostrarDados();
}

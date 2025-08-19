package factories;

import veiculos.Veiculo;

public interface VeiculoFactory {
    Veiculo createVeiculo(String placa, String cor, long quilometragem, double valorEmReais);

}

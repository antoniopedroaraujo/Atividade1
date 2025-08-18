package factories;

import veiculos.Carro;

public class CarroFactory implements VeiculoFactory {
    @Override
    public Carro createVeiculo(String placa, String cor, long quilometragem, double valorEmReais) {
        return new Carro(placa, cor, quilometragem, valorEmReais);
    }
}

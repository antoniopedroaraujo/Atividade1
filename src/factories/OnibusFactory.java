package factories;

import veiculos.Onibus;

public class OnibusFactory implements VeiculoFactory {
    @Override
    public Onibus createVeiculo(String placa, String cor, long quilometragem, double valorEmReais) {
        return new Onibus(placa, cor, quilometragem, valorEmReais);
    }

}

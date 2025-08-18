package factories;

import veiculos.Caminhao;

public class CaminhaoFactory implements VeiculoFactory {
    @Override
    public Caminhao createVeiculo(String placa, String cor, long quilometragem, double valorEmReais) {
        return new Caminhao(placa, cor, quilometragem, valorEmReais);
    }
}








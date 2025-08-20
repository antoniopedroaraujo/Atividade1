package builders;

import factories.CaminhaoFactory;
import factories.CarroFactory;
import factories.OnibusFactory;
import veiculos.Veiculo;
import veiculos.VeiculoType;

import java.util.Scanner;

public class VeiculoBuilder implements Builder{

    private VeiculoType veiculoType;
    private String placa;
    private String cor;
    private int quilometragem;
    private double valorEmReais;

    @Override
    public void setVeiculoType(VeiculoType veiculoType) {
        this.veiculoType = veiculoType;
    }

    @Override
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    @Override
    public void setValorEmReais(double valorEmReais) {
        this.valorEmReais = valorEmReais;
    }

    public Veiculo buildVeiculo(){
        Scanner input = new Scanner(System.in);

        if (veiculoType == VeiculoType.CARRO)
                return new CarroFactory().createVeiculo(placa,cor,quilometragem,valorEmReais);
        if (veiculoType == VeiculoType.ONIBUS)
            return new OnibusFactory().createVeiculo(placa,cor,quilometragem,valorEmReais);
        if (veiculoType == VeiculoType.CAMINHAO)
            return new CaminhaoFactory().createVeiculo(placa,cor,quilometragem,valorEmReais);
        return null;
    }
}

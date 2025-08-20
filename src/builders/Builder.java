package builders;

import veiculos.VeiculoType;

public interface Builder {
    void setVeiculoType(VeiculoType veiculoType);
    void setPlaca(String placa);
    void setCor(String cor);
    void setQuilometragem(int quilometragem);
    void setValorEmReais(double valorEmReais);
}

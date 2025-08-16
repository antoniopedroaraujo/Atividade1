package builders;

import veiculos.*;

import java.util.List;

public interface VeiculoListBuilder {
    List<Veiculo> buildVeiculoList(List<Carro> carros, List<Onibus> onibus, List<Caminhao> caminhoes);
}

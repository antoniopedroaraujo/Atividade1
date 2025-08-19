package builders;

import factories.VeiculoFactory;
import veiculos.*;

import java.util.List;

public interface ListBuilder {
    List<Veiculo> buildList(int qntVeiculos, VeiculoFactory veiculoFactory);

}

package builders;

import factories.VeiculoFactory;
import veiculos.Veiculo;
import veiculos.VeiculoType;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VeiculoListBuilder {

    public List<Veiculo> buildList(int qntVeiculos, VeiculoType veiculoType) {

        Scanner input = new Scanner(System.in);
        List<Veiculo> veiculoList = new ArrayList<>();

        VeiculoBuilder veiculoBuilder = new VeiculoBuilder();
        veiculoBuilder.setVeiculoType(veiculoType);

        for (int i = 1; i < qntVeiculos+1; i++) {
            System.out.println("-------------------------------------------------------------------");
            System.out.println("Criando veículo - ("+i+" / "+qntVeiculos+").");
            System.out.println("Insira a placa : ");
            veiculoBuilder.setPlaca(input.next());

            System.out.println("Insira a cor : ");
            veiculoBuilder.setCor(input.next());

            System.out.println("Insira a quilometragem : ");
            veiculoBuilder.setQuilometragem(input.nextInt());

            System.out.println("Insira o valor em reais : ");
            veiculoBuilder.setValorEmReais(input.nextDouble());

            veiculoList.add(veiculoBuilder.buildVeiculo());
            System.out.println("Veiculo adicionado com sucesso!");
        }

        return veiculoList;
    }
}

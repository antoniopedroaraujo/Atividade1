package builders;

import factories.VeiculoFactory;
import veiculos.Veiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VeiculoListBuilder implements ListBuilder{

    @Override
    public List<Veiculo> buildList(int qntVeiculos, VeiculoFactory veiculoFactory) {

        Scanner input = new Scanner(System.in);
        List<Veiculo> veiculoList = new ArrayList<>();

        for (int i = 1; i < qntVeiculos+1; i++) {
            System.out.println("-------------------------------------------------------------------");
            System.out.println("Criando veículo - ("+i+" / "+qntVeiculos+").");
            System.out.println("Insira a placa : ");
            String placa = input.next();

            System.out.println("Insira a cor : ");
            String cor = input.next();

            System.out.println("Insira a quilometragem : ");
            long quilometragem = input.nextLong();

            System.out.println("Insira o valor em reais : ");
            double valorEmReais = input.nextDouble();

            veiculoList.add(veiculoFactory.createVeiculo(placa, cor, quilometragem, valorEmReais));
            System.out.println("Veiculo adicionado com sucesso!");
        }

        return veiculoList;
    }
}

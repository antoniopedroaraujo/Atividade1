package app;

import builders.VeiculoListBuilder;
import factories.*;
import veiculos.Veiculo;
import veiculos.VeiculoType;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public void run(){

        Scanner input = new Scanner(System.in);
        List<Veiculo> veiculoList = new ArrayList<>();
        VeiculoListBuilder veiculoListBuilder = new VeiculoListBuilder();

        System.out.println("Insira o número de carros:");
        int qntCarros = input.nextInt();

        System.out.println("Insira o número de onibus:");
        int qntOnibus = input.nextInt();

        System.out.println("Insira o número de caminhoes:");
        int qntCaminhoes = input.nextInt();
        
        System.out.println("================== CARROS ==================\n");
        veiculoList.addAll(veiculoListBuilder.buildList(qntCarros, VeiculoType.CARRO));

        System.out.println("================== ONIBUS ==================\n");
        veiculoList.addAll(veiculoListBuilder.buildList(qntOnibus, VeiculoType.ONIBUS));

        System.out.println("================== CAMINHOES ==================\n");
        veiculoList.addAll(veiculoListBuilder.buildList(qntCaminhoes, VeiculoType.CAMINHAO));
        
        System.out.println("\nREGISTROS CONCLUIDOS!");

        for (Veiculo veiculo : veiculoList) {

            input.nextLine();
            System.out.println(veiculo.mostrarDados());

        }
    }
}

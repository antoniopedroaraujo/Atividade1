package app;

import builders.VeiculoListBuilder;
import factories.*;
import veiculos.Veiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public void run(){
        Scanner input = new Scanner(System.in);
        List<Veiculo> veiculoList = new ArrayList<>();

        System.out.println("Insira o número de carros:");
        int qntCarros = input.nextInt();

        System.out.println("Insira o número de onibus:");
        int qntOnibus = input.nextInt();

        System.out.println("Insira o número de caminhoes:");
        int qntCaminhoes = input.nextInt();

        CarroFactory carroFactory = new CarroFactory();
        OnibusFactory onibusFactory = new OnibusFactory();
        CaminhaoFactory caminhaoFactory = new CaminhaoFactory();
        
        VeiculoListBuilder veiculoListBuilder = new VeiculoListBuilder();
        
        System.out.println("================== CARROS ==================\n");
        veiculoList.addAll(veiculoListBuilder.buildList(qntCarros, carroFactory));
        System.out.println("================== ONIBUS ==================\n");
        veiculoList.addAll(veiculoListBuilder.buildList(qntOnibus, onibusFactory));
        System.out.println("================== CAMINHOES ==================\n");
        veiculoList.addAll(veiculoListBuilder.buildList(qntCaminhoes, caminhaoFactory));
        
        System.out.println("\nREGISTROS CONCLUIDOS!");

        for (Veiculo veiculo : veiculoList) {
            System.out.println(veiculo.mostrarDados());
        }

    }

}

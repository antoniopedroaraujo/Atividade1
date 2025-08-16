package app;

import builders.VeiculoListBuilder;
import factories.*;
import veiculos.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application implements VeiculoListBuilder {

    private List<Carro> carroList = new ArrayList<>();
    private List<Onibus> onibusList = new ArrayList<>();
    private List<Caminhao> caminhaoList = new ArrayList<>();

    public void run(){
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o número de carros:");
        int qntCarros = input.nextInt();

        System.out.println("Insira o número de onibus:");
        int qntOnibus = input.nextInt();

        System.out.println("Insira o número de caminhoes:");
        int qntCaminhoes = input.nextInt();

        CarroFactory carroFactory = new CarroFactory();
        OnibusFactory onibusFactory = new OnibusFactory();
        CaminhaoFactory caminhaoFactory = new CaminhaoFactory();

        for (int i = 1; i < qntCarros+1; i++) {
            System.out.println("-------------------------------------------------------------------");
            System.out.println("Criando novo carro ("+i+" / "+qntCarros+").");
            System.out.println("Insira a placa do carro");
            String placa = input.next();
            System.out.println("Insira a cor do carro");
            String cor = input.next();
            System.out.println("Insira a quilometragem do carro");
            long quilometragem = input.nextLong();
            System.out.println("Insira o valor em reais");
            double valorEmReais = input.nextDouble();
            this.carroList.add(carroFactory.createVeiculo(placa, cor, quilometragem, valorEmReais));
            System.out.println("Carro adicionado com sucesso!");
        }

        for (int i = 1; i < qntOnibus+1; i++) {
            System.out.println("-------------------------------------------------------------------");
            System.out.println("Criando novo onibus ("+i+" / "+qntOnibus+").");
            System.out.println("Insira a placa do onibus");
            String placa = input.next();
            System.out.println("Insira a cor do onibus");
            String cor = input.next();
            System.out.println("Insira a quilometragem do onibus");
            long quilometragem = input.nextLong();
            System.out.println("Insira o valor em reais");
            double valorEmReais = input.nextDouble();
            this.onibusList.add(onibusFactory.createVeiculo(placa, cor, quilometragem, valorEmReais));
            System.out.println("Onibus adicionado com sucesso!");
        }

        for (int i = 1; i < qntCaminhoes+1; i++) {
            System.out.println("-------------------------------------------------------------------");
            System.out.println("Criando novo caminhao ("+i+" / "+qntCaminhoes+").");
            System.out.println("Insira a placa do caminhao");
            String placa = input.next();
            System.out.println("Insira a cor do caminhao");
            String cor = input.next();
            System.out.println("Insira a quilometragem do caminhao");
            long quilometragem = input.nextLong();
            System.out.println("Insira o valor em reais");
            double valorEmReais = input.nextDouble();
            this.caminhaoList.add(caminhaoFactory.createVeiculo(placa, cor, quilometragem, valorEmReais));
            System.out.println("Caminhao adicionado com sucesso!");
        }

        System.out.println("\nREGISTROS CONCLUIDOS!");

        List<Veiculo> veiculoList = buildVeiculoList(this.carroList,this.onibusList, this.caminhaoList);
        for (Veiculo veiculo : veiculoList) {
            System.out.println("==========================================================");
            System.out.println(veiculo.mostrarDados());
        }

    }

    @Override
    public List<Veiculo> buildVeiculoList(List<Carro> carros, List<Onibus> onibus, List<Caminhao> caminhoes) {

        List<Veiculo> veiculoList = new ArrayList<>();

        veiculoList.addAll(carros);
        veiculoList.addAll(onibus);
        veiculoList.addAll(caminhoes);

        return veiculoList;
    }

}

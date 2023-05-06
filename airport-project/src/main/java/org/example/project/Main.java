package org.example.project;

import org.example.basecentral.BaseCentral;
import org.example.entities.Voo;
import org.example.entities.aeroporto.*;
import org.example.entities.aviao.Aviao;
import org.example.entities.aviao.AviaoAsaFixa;
import org.example.entities.aviao.componentes.Combustivel;
import org.example.entities.aviao.componentes.Motor;
import org.example.entities.hangar.Estacionamento;
import org.example.entities.hangar.Hangar;
import org.example.entities.pessoas.Passageiro;
import org.example.entities.pessoas.Piloto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Aeroporto> aeroportos = new ArrayList<>();
    public static List<Voo> voos = new ArrayList<>();

    public static List<Piloto> pilotos = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        do{

            System.out.println("--------------------------------------");
            System.out.println("CENTRAL DE GERENCIAMENTO");
            System.out.println("1 - gerenciar aeroportos");
            System.out.println("2 - gerenciar voos");
            System.out.println("3 - ser um piloto");
            option = scanner.nextInt();


            switch(option){
                case 1:
                    GerenciaAeroportos.central(scanner, aeroportos);
                    break;
                case 2:
                    centralDeVoos(scanner);
                    break;
                case 3:
                    GerenciaPilotos.centralDePilotos(scanner, pilotos);
                    break;
            }

        } while(option != 0);
    }

    public static void centralDeVoos(Scanner scanner){

        int option = 0;
        do {

            System.out.println("------------------------------");
            System.out.println("CENTRAL DE VOOS");
            System.out.println("0 - voltar ao menu");
            System.out.println("1 - crie um voo");
            System.out.println("2 - listar voos");
            option = scanner.nextInt();

            switch (option){
                case 1:
                    Voo voo = criaVoo(scanner);
                    voos.add(voo);
                    break;
                case 2:
                    voos.forEach(i -> System.out.println(i));
                default:
                    break;
            }
        } while(option != 0);
    }

    private static Voo criaVoo(Scanner scanner) {
        scanner.nextLine();
        System.out.println("Digite o numero do voo: ");
        Integer vooId = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o código da avião: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        //TODO: função que chama um novo prompt dando opção de criar um novo piloto ou usar um existente
        System.out.println("Digite o nome do piloto: ");
        String nome = scanner.nextLine();

        String finalNome1 = nome;
        List<Piloto> listaDePilotos = pilotos.stream().filter(x -> finalNome1.equals(x.getNome())).toList();

        while(listaDePilotos.size() == 0){
            System.out.println("Digite o nome de um piloto existente: ");
            nome = scanner.nextLine();
            String finalNome = nome;
            listaDePilotos = pilotos.stream().filter(x -> finalNome.equals(x.getNome())).toList();
        }
        Piloto piloto = listaDePilotos.get(0);

        //TODO: Habilitar opção de listar os aeroportos por nome e fazer o usuário digitar esse nome
        System.out.println("Digite o nome do aeroporto de origem: ");
        String nomeDoAeroportoOrigem = scanner.nextLine();

        System.out.println("Digite o nome do aeroporto de destino: ");
        String nomeDoAeroportoDestino = scanner.nextLine();

        List<Aeroporto> collect = aeroportos.stream().filter(x -> nomeDoAeroportoOrigem.equals(x.getNome())).toList();
        Aeroporto origem = collect.get(0);

        collect = aeroportos.stream().filter(x -> nomeDoAeroportoDestino.equals(x.getNome())).toList();
        Aeroporto destino = collect.get(0);

        Aviao aviao = new AviaoAsaFixa(id, pilotos, new Combustivel(), new Motor(), piloto, false);
        Voo voo = new Voo(vooId, aviao, origem, destino, new ArrayList<Passageiro>());

        return voo;
    }

}

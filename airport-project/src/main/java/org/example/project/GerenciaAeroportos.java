package org.example.project;

import org.example.basecentral.BaseCentral;
import org.example.entities.aeroporto.*;
import org.example.entities.hangar.Estacionamento;
import org.example.entities.hangar.Hangar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciaAeroportos {

    public static void central(Scanner scanner, List<Aeroporto> aeroportos) throws Exception {
        int option = 0;
        do {

            System.out.println("------------------------------");
            System.out.println("CENTRAL DE AEROPORTOS");
            System.out.println("0 - voltar ao menu");
            System.out.println("1 - crie um aeroporto");
            System.out.println("2 - listar aeroportos");
            option = scanner.nextInt();

            switch (option){
                case 1:
                    Aeroporto aeroporto = criaAeroporto(scanner);
                    aeroportos.add(aeroporto);
                    break;
                case 2:
                    aeroportos.forEach(i -> System.out.println(i));
                default:
                    break;
            }
        } while(option != 0);
    }

    private static Aeroporto criaAeroporto(Scanner scanner) throws Exception {
        scanner.nextLine();
        System.out.println("Digite o nome do aeroporto: ");
        String name = scanner.nextLine();

        System.out.println("Digite o código da pista: ");
        List<Pista> pistas = new ArrayList<>();
        Pista pista1 = new Pista(scanner.nextInt());

        System.out.println("Digite o código do terminal: ");
        List<Terminal> terminais = new ArrayList<>();
        terminais.add(new Terminal(scanner.nextInt()));

        System.out.println("Digite o código do hangar: ");
        List<Hangar> hangares = new ArrayList<>();
        hangares.add(new Estacionamento(scanner.nextInt()));

        System.out.println("Digite o código do controlador: ");
        Controlador c1 = new Controlador(scanner.nextInt());
        List<Controlador> controladores = new ArrayList<>();
        controladores.add(c1);

        System.out.println("Digite o código do radar: ");
        Radar radar = new Radar(scanner.nextInt());
        List<Radar> radars = new ArrayList<>();
        radars.add(radar);

        System.out.println("Digite o código da Torre de controle: ");
        TorreControle torreControle = new TorreControle(scanner.nextInt(), controladores, radars);

        pistas.add(pista1);

        Aeroporto aeroporto = new Aeroporto(name, pistas, terminais, hangares, torreControle, 1, new BaseCentral());

        return aeroporto;

    }

}

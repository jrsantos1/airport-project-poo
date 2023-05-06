package org.example.project;

import org.example.basecentral.BaseCentral;
import org.example.entities.aeroporto.*;
import org.example.entities.hangar.Estacionamento;
import org.example.entities.hangar.Hangar;
import org.example.entities.pessoas.Piloto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciaPilotos {

    public static void centralDePilotos(Scanner scanner, List<Piloto> pilotos) throws Exception{
        int option = 0;
        do {

            System.out.println("------------------------------");
            System.out.println("CENTRAL DE PILOTOS");
            System.out.println("0 - voltar ao menu");
            System.out.println("1 - crie um piloto");
            System.out.println("2 - listar pilotos");
            System.out.println("3 - Pousar avião");
            option = scanner.nextInt();

            switch (option){
                case 1:
                    Piloto piloto = criaPiloto(scanner);
                    pilotos.add(piloto);
                    break;
                case 2:
                    pilotos.forEach(i -> System.out.println(i));
                case 3:
                    pousar(pilotos);
                    break;
                default:
                    break;
            }
        } while(option != 0);
    }

    private static Piloto criaPiloto(Scanner scanner) throws Exception {
        scanner.nextLine();
        System.out.println("Digite o nome do piloto: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o código do piloto: ");
        Integer codigo = scanner.nextInt();
        scanner.nextLine();


        Piloto piloto = new Piloto(codigo, nome);

        return piloto;

    }

    //TODO: implementar método para pousar
    private static void pousar(List<Piloto> pilotos){
        System.out.println(pilotos.get(0).getAviao());

    }



}

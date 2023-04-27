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
import org.example.entities.pessoas.Piloto;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) throws Exception {
        //TODO: AEROPORTO É A CLASSE PRINCIPAL
        //List<Pista> pistas, List<Terminal> terminais, List<Hangar> hangares, TorreControle torreControle, Integer id, BaseCentral baseCentral

        List<Pista> pistas = new ArrayList<>();
        Pista pista1 = new Pista(1);

        List<Terminal> terminais = new ArrayList<>();
        terminais.add(new Terminal(1));

        List<Hangar> hangares = new ArrayList<>();
        hangares.add(new Estacionamento(1));

        Controlador c1 = new Controlador(1);
        List<Controlador> controladores = new ArrayList<>();
        controladores.add(c1);

        Radar radar = new Radar(1);
        List<Radar> radars = new ArrayList<>();
        radars.add(radar);

        TorreControle torreControle = new TorreControle(controladores, radars);

        pistas.add(pista1);

        Aeroporto aeroporto = new Aeroporto(pistas, terminais, hangares, torreControle, 1, new BaseCentral());

        //TODO: VOO É A SEGUNDA CLASSE PRINCIPAL
        //Integer id, List<Piloto > pilotos, Combustivel combustivel, Motor motor, Piloto copiloto, boolean emEspera
        //Aviao aviao = new AviaoAsaFixa(1);

        //Integer id, Aviao aviao, Aeroporto origem, Aeroporto destino, List<Passageiro> passageiro
        //Voo voo = new Voo(1, new Aviao(), aeroporto, aeroporto1, passageiros);

    }
}

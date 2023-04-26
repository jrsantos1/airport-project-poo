package org.example.project;

import org.example.entities.aeroporto.Aeroporto;
import org.example.entities.Voo;
import org.example.entities.aeroporto.Controlador;
import org.example.entities.aeroporto.Pista;
import org.example.entities.aeroporto.TorreControle;
import org.example.entities.aviao.Aviao;
import org.example.entities.aviao.AviaoAsaFixa;
import org.example.entities.aviao.componentes.Combustivel;
import org.example.entities.aviao.componentes.Motor;
import org.example.entities.pessoas.Piloto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Voo voo = new Voo();

        try {
            //OBJETOS DE SAIDA DO AEROPORTO
            Controlador controlador1 = new Controlador();
            TorreControle torreControle = new TorreControle(controlador1);
            Pista pista1 = new Pista();
            Aeroporto saida = new Aeroporto(pista1, torreControle);

            //OBJETOS DE DESTINO
            Controlador controlador2 = new Controlador();
            TorreControle torreControle2 = new TorreControle(controlador2);
            Pista pista2 = new Pista();
            Aeroporto destino = new Aeroporto(pista2, torreControle2);

            Piloto piloto = new Piloto();
            List<Piloto> pilotos = new ArrayList<>();
            pilotos.add(piloto);

            Aviao aviao = new AviaoAsaFixa(1, new Voo(), pilotos, new Combustivel(), new Motor(), piloto, false);

            piloto.solicitarPouso();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
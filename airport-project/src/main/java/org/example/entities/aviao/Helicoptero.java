package org.example.entities.aviao;

import org.example.entities.Voo;
import org.example.entities.aeroporto.Aeroporto;
import org.example.entities.aviao.componentes.Combustivel;
import org.example.entities.aviao.componentes.Motor;
import org.example.entities.pessoas.Piloto;

import java.util.List;

public class Helicoptero extends Aviao{
    public Helicoptero(Integer id, Voo voo, List<Piloto> pilotos, Combustivel combustivel, Motor motor, Piloto copiloto, boolean emEspera) {
        super(id, voo, pilotos, combustivel, motor, copiloto, emEspera);
    }

}

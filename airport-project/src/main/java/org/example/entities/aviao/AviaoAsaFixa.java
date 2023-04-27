package org.example.entities.aviao;

import org.example.entities.Voo;
import org.example.entities.aeroporto.Aeroporto;
import org.example.entities.aeroporto.Pista;
import org.example.entities.aviao.componentes.Combustivel;
import org.example.entities.aviao.componentes.Motor;
import org.example.entities.pessoas.Piloto;

import java.util.List;

public class AviaoAsaFixa extends  Aviao{

    private Pista pistaDePouso;
    private Pista pistaDeDecolagem;

    public AviaoAsaFixa(Integer id, List<Piloto> pilotos, Combustivel combustivel, Motor motor, Piloto copiloto, boolean emEspera) {
        super(id, pilotos, combustivel, motor, copiloto, emEspera);
    }

    public void setPistaDeDecolagem(Pista pistaDeDecolagem) {
        this.pistaDeDecolagem = pistaDeDecolagem;
    }

    public void setPistaDePouso(Pista pistaDePouso) {
        this.pistaDePouso = pistaDePouso;
    }
}

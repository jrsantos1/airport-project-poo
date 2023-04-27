package org.example.entities;

import org.example.basecentral.BaseCentral;
import org.example.entities.aeroporto.Aeroporto;
import org.example.entities.aviao.Aviao;
import org.example.entities.pessoas.Passageiro;

import java.util.List;

public class Voo {
    private Integer id;
    private Aviao aviao;
    private Aeroporto origem;
    private Aeroporto destino;
    private List<Passageiro> passageiro;

    public Voo(Integer id, Aviao aviao, Aeroporto origem, Aeroporto destino, List<Passageiro> passageiro) {
        this.id = id;
        this.aviao = aviao;
        this.origem = origem;
        this.destino = destino;
        this.passageiro = passageiro;
        aviao.setVoo(this);
    }

    public void registrarVoo(){
        BaseCentral.registrarVoo(this);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Aeroporto getDestino() {
        return destino;
    }

    public void setOrigem(Aeroporto origem) {
        this.origem = origem;
    }
}

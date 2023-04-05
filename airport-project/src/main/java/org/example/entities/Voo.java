package org.example.entities;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

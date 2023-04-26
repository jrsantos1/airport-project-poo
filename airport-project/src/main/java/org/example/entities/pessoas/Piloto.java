package org.example.entities.pessoas;

import org.example.entities.aviao.Aviao;

public class Piloto {
    private Aviao aviao;


    public Piloto(){

    }

    public void solicitarPouso(){
        aviao.getVoo().getDestino().getTorreControles().aeroportoPodeReceberVoo(aviao);

    }

}

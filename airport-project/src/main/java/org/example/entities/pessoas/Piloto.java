package org.example.entities.pessoas;

import org.example.entities.aviao.Aviao;

public class Piloto {
    private Aviao aviao;
    private Integer id;
    private String nome;

    public Piloto(Integer id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public void setAviao(Aviao aviao) {
        this.aviao = aviao;
    }

    public String getNome() {
        return nome;
    }

    public Aviao getAviao() {
        return aviao;
    }

    public void solicitarPouso(){
        aviao.getVoo().getDestino().getTorreControles().aeroportoPodeReceberVoo(aviao);

    }

    @Override
    public String toString() {
        return "Piloto: " + nome;
    }
}

package org.example.entities.aeroporto;

import org.example.entities.aviao.Aviao;

import java.util.List;
import java.util.Objects;

public class Pista {

    private Integer id;

    private Aeroporto aeroporto;
    private List<Aviao> avioesNaPista;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Aeroporto getAeroporto() {
        return aeroporto;
    }

    public void setAeroporto(Aeroporto aeroporto) {
        this.aeroporto = aeroporto;
    }

    public List<Aviao> getAvioesNaPista() {
        return avioesNaPista;
    }

    public void setAviaoNaPista(Aviao aviao) {
        this.avioesNaPista.add(aviao);
    }

    public boolean pistaEstaCheia(){
        if(avioesNaPista.size() == 3){
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pista pista)) return false;
        return Objects.equals(id, pista.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

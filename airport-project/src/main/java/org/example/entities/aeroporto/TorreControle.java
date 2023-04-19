package org.example.entities.aeroporto;

import org.example.entities.aviao.Aviao;

import java.util.List;
import java.util.Objects;

public class TorreControle {

    private Integer id;

    private List<Radar> radares;

    private List<Controlador> controladores;

    private Aeroporto aeroporto;

    public TorreControle(Controlador controlador) throws Exception{
        if(controlador == null){
            throw new Exception("A torre de controle precisa de ao menos um controlador");
        }

        this.controladores.add(controlador);
    }

    public boolean aeroportoPodeReceberVoo(Aviao aviao){
        return aeroporto.podeReceberVoo(aviao);
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Radar> getRadares() {
        return radares;
    }

    public void setRadares(List<Radar> radares) {
        this.radares = radares;
    }

    public Aeroporto getAeroporto() {
        return aeroporto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TorreControle that = (TorreControle) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

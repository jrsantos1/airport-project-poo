package org.example.entities.aeroporto;

import org.example.entities.aviao.Aviao;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TorreControle {

    private Integer id;

    private List<Radar> radares;

    private List<Controlador> controladores = new ArrayList<>();

    private Aeroporto aeroporto;

    public TorreControle(List<Controlador> controlador, List<Radar> radares) throws Exception{
        if(controlador == null || radares.isEmpty() || radares == null){
            throw new Exception("A torre de controle precisa de ao menos um controlador");
        }

        this.controladores = controlador;
        for (Controlador c: controlador) {
            c.setTorreControle(this);
        }

        this.radares = radares;
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

    public void setAeroporto(Aeroporto aeroporto) {
        this.aeroporto = aeroporto;
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

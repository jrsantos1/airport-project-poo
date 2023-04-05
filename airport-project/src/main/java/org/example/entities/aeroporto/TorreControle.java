package org.example.entities.aeroporto;

import java.util.List;

public class TorreControle {

    private Integer id;

    private List<Radar> radares;

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
}

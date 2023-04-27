package org.example.entities.hangar;

import org.example.entities.aeroporto.Aeroporto;

public abstract class Hangar {

    private Integer id;

    private Aeroporto aeroporto;

    public Hangar(Integer id){
        this.id = id;
    }

    public void setAeroporto(Aeroporto aeroporto) {
        this.aeroporto = aeroporto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

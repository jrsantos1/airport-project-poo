package org.example.entities.aeroporto;

public class Radar {

    private Aeroporto aeroporto;

    private Integer id;

    public Radar(Integer id){
        this.id = id;
    }

    public void setAeroporto(Aeroporto aeroporto) {
        this.aeroporto = aeroporto;
    }
}

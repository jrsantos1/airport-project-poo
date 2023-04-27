package org.example.entities.aeroporto;

import org.example.entities.aviao.Aviao;

public class Controlador {

    private Integer id;

    private TorreControle torreControle;

    public Controlador(Integer id){
        this.id = id;
    }
    public void setTorreControle(TorreControle torreControle) {
        this.torreControle = torreControle;
    }

    public boolean solicitarPouso(Aviao aviao){
        if(torreControle.aeroportoPodeReceberVoo(aviao)){
            return true;
        }
        return false;
    }
}

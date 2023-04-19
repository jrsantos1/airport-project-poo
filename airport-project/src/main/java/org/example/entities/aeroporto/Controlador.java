package org.example.entities.aeroporto;

import org.example.entities.aviao.Aviao;

public class Controlador {

    private TorreControle torreControle;

    public boolean solicitarPouso(Aviao aviao){
        if(torreControle.aeroportoPodeReceberVoo(aviao)){
            return true;
        }
        return false;
    }
}

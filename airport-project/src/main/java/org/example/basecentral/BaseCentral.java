package org.example.basecentral;

import org.example.entities.Voo;

import java.util.List;

public class BaseCentral {

    private static List<Voo> voosRegistrados;


    public static void registrarVoo(Voo voo){
        voosRegistrados.add(voo);
    }

    public static List<Voo> getVoosRegistrados(){
        return voosRegistrados;
    }
}

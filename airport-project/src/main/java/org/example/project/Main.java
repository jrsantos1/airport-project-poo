package org.example.project;

import org.example.entities.aeroporto.Aeroporto;
import org.example.entities.Voo;

public class Main {
    public static void main(String[] args) {
        Voo voo = new Voo();

        try {
            //Aeroporto aeroporto = new Aeroporto();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
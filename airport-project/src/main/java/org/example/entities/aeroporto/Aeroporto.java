package org.example.entities.aeroporto;

import org.example.basecentral.BaseCentral;
import org.example.entities.Voo;
import org.example.entities.hangar.Hangar;

import java.util.List;

public class Aeroporto {

    private List<Pista> pistas;
    private List<Terminal> terminais;
    private List<Hangar> hangares;

    private List<TorreControle> torreControles;

    private Integer id;

    private Voo voo;

    //INSTÂNCIAR NA CRIAÇÃO DO CONSTRUCTOR
    private BaseCentral baseCentral = new BaseCentral();

    //USAR OS RADARES DA TORRE DE CONTROLE
    private List<Radar> radares;

    //VERIFICAR SE POSSUI AO MENOS UMA PISTA E UMA TORRE DE CONTROLE


    public List<Pista> getPistas() {
        return pistas;
    }

    public void setPistas(List<Pista> pistas) {
        this.pistas = pistas;
    }

    public List<Terminal> getTerminais() {
        return terminais;
    }

    public void setTerminais(List<Terminal> terminais) {
        this.terminais = terminais;
    }

    public List<Hangar> getHangares() {
        return hangares;
    }

    public void setHangares(List<Hangar> hangares) {
        this.hangares = hangares;
    }

    public List<TorreControle> getTorreControles() {
        return torreControles;
    }

    public void setTorreControles(List<TorreControle> torreControles) {
        this.torreControles = torreControles;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public BaseCentral getBaseCentral() {
        return baseCentral;
    }

    public void setBaseCentral(BaseCentral baseCentral) {
        this.baseCentral = baseCentral;
    }

    public List<Radar> getRadares() {
        return radares;
    }

    public void setRadares(List<Radar> radares) {
        this.radares = radares;
    }
}

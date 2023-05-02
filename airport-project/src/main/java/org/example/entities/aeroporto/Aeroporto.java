package org.example.entities.aeroporto;

import org.example.basecentral.BaseCentral;
import org.example.entities.Voo;
import org.example.entities.aviao.Aviao;
import org.example.entities.hangar.Hangar;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aeroporto {

    private List<Pista> pistas;
    private List<Terminal> terminais;
    private List<Hangar> hangares;

    private TorreControle torreControle;

    private Integer id;

    private Voo voo;

    //INSTÂNCIAR NA CRIAÇÃO DO CONSTRUCTOR
    private BaseCentral baseCentral = new BaseCentral();

    //USAR OS RADARES DA TORRE DE CONTROLE
    private List<Radar> radares;

    private String nome;

    public Aeroporto(String name, List<Pista> pistas, List<Terminal> terminais, List<Hangar> hangares, TorreControle torreControle, Integer id, BaseCentral baseCentral) throws Exception {
        if(pistas == null || torreControle == null || pistas.isEmpty()){
            throw new Exception("Necessário ter ao menos uma pista e uma torre de controle");
        }
        nome = name;

        this.pistas = pistas;
        for (Pista p: pistas) {
            p.setAeroporto(this);
        }

        this.terminais = terminais;
        for (Terminal t: terminais) {
            t.setAeroporto(this);
        }


        this.hangares = hangares;
        for (Hangar h: hangares) {
            h.setAeroporto(this);
        }


        this.torreControle = torreControle;
        torreControle.setAeroporto(this);

        this.id = id;


        this.baseCentral = baseCentral;

        this.radares = torreControle.getRadares();
        for (Radar r: radares) {
            r.setAeroporto(this);
        }
    }

    public List<Voo> getAllVoos(){
        return BaseCentral.getVoosRegistrados();
    }

    public boolean podeReceberVoo(Aviao aviao){
        for(Pista p : pistas){
            if(!p.pistaEstaCheia()){
                p.setAviaoNaPista(aviao);
                return true;
            }
        }
        aviao.setEmEspera(true);
        return false;
    }

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

    public TorreControle getTorreControles() {
        return torreControle;
    }

    public void setTorreControles(TorreControle torreControle) {
        this.torreControle = torreControle;
        this.radares = torreControle.getRadares();
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aeroporto aeroporto)) return false;
        return Objects.equals(id, aeroporto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Aeroporto: " + nome;
    }
}

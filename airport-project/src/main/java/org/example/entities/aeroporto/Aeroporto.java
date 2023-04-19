package org.example.entities.aeroporto;

import org.example.basecentral.BaseCentral;
import org.example.entities.Voo;
import org.example.entities.aviao.Aviao;
import org.example.entities.hangar.Hangar;

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

    //VERIFICA SE POSSUI AO MENOS UMA PISTA E UMA TORRE DE CONTROLE
    public Aeroporto(Pista pista, TorreControle torreControle) throws Exception{
        if(pista == null || torreControle == null){
            throw new Exception("Necessário ter ao menos uma pista e uma torre de controle");
        }

        this.pistas.add(pista);
        this.torreControle = torreControle;
    }

    public List<Voo> getAllVoos(){
        return BaseCentral.getVoosRegistrados();
    }

    public void podeReceberVoo(Aviao aviao){
        for(Pista p : pistas){
            if(!p.pistaEstaCheia()){
                p.setAviaoNaPista(aviao);
                return;
            }
        }
        aviao.setEmEspera(true);
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
}

package org.example.entities.aviao;

import org.example.entities.Voo;
import org.example.entities.aviao.componentes.Combustivel;
import org.example.entities.aviao.componentes.Motor;
import org.example.entities.pessoas.Piloto;

import java.util.List;

public abstract class Aviao {

    private Integer id;

    private Voo voo;
    private List<Piloto> pilotos;
    private Combustivel combustivel;
    private Motor motor;

    private Piloto copiloto;

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

    public List<Piloto> getPilotos() {
        return pilotos;
    }

    public void setPilotos(List<Piloto> pilotos) {
        this.pilotos = pilotos;
    }

    public Combustivel getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(Combustivel combustivel) {
        this.combustivel = combustivel;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Piloto getCopiloto() {
        return copiloto;
    }

    public void setCopiloto(Piloto copiloto) {
        this.copiloto = copiloto;
    }
}
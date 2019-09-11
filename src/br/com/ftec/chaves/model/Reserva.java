package br.com.ftec.chaves.model;
import java.util.Calendar;

public class Reserva {
    private String turno;
    private Sala sala;
    private String dia;
    private Colaborador colaborador;

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }
    
    public Sala getSala() {
        return sala;
    }

    public String getTurno() {
        return turno;
    }

    public String getDia() {
        return dia;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
    
    
}

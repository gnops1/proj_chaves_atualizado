package br.com.ftec.chaves.model;
import java.util.Calendar;
        
public class Ponto {
    private String nome, horaRetirada, horaDevolucao;
    private Calendar dia;

    public String getNome() {
        return nome;
    }

    public Calendar getDia() {
        return dia;
    }

    public String getHoraRetirada() {
        return horaRetirada;
    }

    public String getHoraDevolucao() {
        return horaDevolucao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDia(Calendar dia) {
        this.dia = dia;
    }

    public void setHoraRetirada(String horaRetirada) {
        this.horaRetirada = horaRetirada;
    }

    public void setHoraDevolucao(String horaDevolucao) {
        this.horaDevolucao = horaDevolucao;
    }
    
    
}

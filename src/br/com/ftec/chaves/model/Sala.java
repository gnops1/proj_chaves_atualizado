package br.com.ftec.chaves.model;

public class Sala {

    private String sala, descricao, tipo;
    private int capacidade;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Sala(String sala, String descricao, String tipo, int capacidade) {
        this.sala = sala;
        this.descricao = descricao;
        this.tipo = tipo;
        this.capacidade = capacidade;
    }
    
    public Sala(){
        
    }
    
    public String getSala() {
        return sala;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}

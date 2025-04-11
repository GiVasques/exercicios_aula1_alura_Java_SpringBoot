package com.github.givasques.exercicios.com.github.givasques.exercicios.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tarefa {
    private String descricao;
    private boolean concluida;
    private String pessoaResponsavel;

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public boolean isConcluida() {
        return concluida;
    }
    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }
    public String getPessoaResponsavel() {
        return pessoaResponsavel;
    }
    public void setPessoaResponsavel(String pessoaResponsavel) {
        this.pessoaResponsavel = pessoaResponsavel;
    }

    @Override
    public String toString() {
        String dados = "\nDescricao: " + descricao + "\n";
        dados += "Concluida: " + concluida + "\n";
        dados += "Pessoa Responsavel: " + pessoaResponsavel + "\n";
        return dados;
    }
}

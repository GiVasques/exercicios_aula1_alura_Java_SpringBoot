package com.github.givasques.exercicios.com.github.givasques.exercicios.model;

import java.math.BigDecimal;

public class Avaliacao <T> {
    private T t;
    private BigDecimal nota;
    private String comentario;

    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }
    public BigDecimal getNota() {
        return nota;
    }
    public void setNota(BigDecimal nota) {
        this.nota = nota;
    }
    public String getComentario() {
        return comentario;
    }
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}

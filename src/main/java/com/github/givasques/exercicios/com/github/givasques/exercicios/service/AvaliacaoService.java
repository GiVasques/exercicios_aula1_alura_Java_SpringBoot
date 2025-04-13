package com.github.givasques.exercicios.com.github.givasques.exercicios.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import com.github.givasques.exercicios.com.github.givasques.exercicios.model.Avaliacao;

public class AvaliacaoService {

    public BigDecimal calculaMedia (List <Avaliacao<?>> avaliacoes) {
        BigDecimal soma = BigDecimal.ZERO;
        for (Avaliacao<?> a : avaliacoes) {
            soma = soma.add(a.getNota());
        }
        soma = soma.divide(BigDecimal.valueOf(avaliacoes.size()), 2, RoundingMode.HALF_UP);
        return soma;
    }
}

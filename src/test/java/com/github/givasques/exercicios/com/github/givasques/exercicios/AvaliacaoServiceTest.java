package com.github.givasques.exercicios.com.github.givasques.exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.github.givasques.exercicios.com.github.givasques.exercicios.model.Assinatura;
import com.github.givasques.exercicios.com.github.givasques.exercicios.model.Avaliacao;
import com.github.givasques.exercicios.com.github.givasques.exercicios.model.Produto;
import com.github.givasques.exercicios.com.github.givasques.exercicios.model.Servico;
import com.github.givasques.exercicios.com.github.givasques.exercicios.service.AvaliacaoService;

public class AvaliacaoServiceTest {

    @Test
    public void deveCalcularMediaDasAvaliacoesCorretamente () {
        Produto p = new Produto();
        Servico s = new Servico();
        Assinatura a = new Assinatura();

        Avaliacao <Produto> a1 = new Avaliacao<>();
        a1.setT(p);
        a1.setComentario("teste1");
        a1.setNota(BigDecimal.valueOf(10));

        Avaliacao <Servico> a2 = new Avaliacao<>();
        a2.setT(s);
        a2.setComentario("teste2");
        a2.setNota(BigDecimal.valueOf(20));

        Avaliacao <Assinatura> a3 = new Avaliacao<>();
        a3.setT(a);
        a3.setComentario("teste3");
        a3.setNota(BigDecimal.valueOf(30));

        ArrayList <Avaliacao<?>> avaliacoes = new ArrayList<>();
        avaliacoes.add(a1);
        avaliacoes.add(a2);
        avaliacoes.add(a3);

        AvaliacaoService service = new AvaliacaoService();

        BigDecimal mediaRecebida = service.calculaMedia(avaliacoes);
        BigDecimal mediaEsperada = BigDecimal.valueOf(20).setScale(2, RoundingMode.HALF_UP);

        assertEquals(mediaEsperada, mediaRecebida);
    }
}

package com.github.givasques.exercicios.com.github.givasques.exercicios.service;

public interface IConversorJson {
    <T> String converteParaJson (T t);

    <T> T converteJson (String json, Class <T> classe);
}

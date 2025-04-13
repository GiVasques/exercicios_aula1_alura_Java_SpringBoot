package com.github.givasques.exercicios.com.github.givasques.exercicios;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.github.givasques.exercicios.com.github.givasques.exercicios.model.Tarefa;
import com.github.givasques.exercicios.com.github.givasques.exercicios.service.Cont;
import com.github.givasques.exercicios.com.github.givasques.exercicios.service.ConversorJson;


@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Exercicio 1
		// Scanner scanner = new Scanner (System.in);

		// System.out.println("Informe um número inteiro maior que 0:");
		// int x = scanner.nextInt();

		// new Cont().contarDeUmAteNumero(x);;



		// Exercicio 4
		Tarefa tarefa = new Tarefa();
		tarefa.setConcluida(true);
		tarefa.setDescricao("tarefa teste");
		tarefa.setPessoaResponsavel("Giovanna");

		ConversorJson conversor = new ConversorJson();
		String json = conversor.converteParaJson(tarefa);

		// Criação de arquivo 
		File arquivo = new File ("tarefa.json");
		FileWriter escritor = new FileWriter(arquivo);
		escritor.write(json); //escreve o json dentro do arquivo
		escritor.close(); //fecha o arquivo


		// Exercicio 5 - continuação do 4
		Tarefa tarefaJson = conversor.converteJson(json, Tarefa.class);
		System.out.println(tarefaJson);
	}

}

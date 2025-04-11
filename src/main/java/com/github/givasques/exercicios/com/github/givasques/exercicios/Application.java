package com.github.givasques.exercicios.com.github.givasques.exercicios;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.github.givasques.exercicios.service.Cont;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner (System.in);

		System.out.println("Informe um número inteiro maior que 0:");
		int x = scanner.nextInt();

		new Cont().contarDeUmAteNumero(x);;
	}

}

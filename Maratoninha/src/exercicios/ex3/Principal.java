package exercicios.ex3;

import java.util.Scanner;

//Elabore um algoritmo que receba uma idade em anos e exiba ao usuário a idade do mesmo em dias

public class Principal {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int idade;
		
		System.out.println("Digite sua idade (em anos): ");
		idade = s.nextInt();
		
		System.out.println("Sua idade em dias é: " + (idade*365));
		
	}

}

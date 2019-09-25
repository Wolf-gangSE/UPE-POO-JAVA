package exercicios.ex5;

import java.util.Scanner;

//Elabore um algoritmo que receba um salário bruto e retorne ao usuário o salário líquido (Descontos: INSS => 11%, IRRF => 7,5%)

public class Principal {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		float salario;
		
		System.out.println("Digite o valor do seu salário (caso seja inteiro digite com zeros no final ex:0,00) : ");
		salario = s.nextFloat();
		
		System.out.println("Seu salário líquido (com descontos do INSS e IRRF) é: " + (salario - 0.11*salario - 0.075*salario));
		
	}

}

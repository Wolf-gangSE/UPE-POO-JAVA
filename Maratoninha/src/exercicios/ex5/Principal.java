package exercicios.ex5;

import java.util.Scanner;

//Elabore um algoritmo que receba um sal�rio bruto e retorne ao usu�rio o sal�rio l�quido (Descontos: INSS => 11%, IRRF => 7,5%)

public class Principal {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		float salario;
		
		System.out.println("Digite o valor do seu sal�rio (caso seja inteiro digite com zeros no final ex:0,00) : ");
		salario = s.nextFloat();
		
		System.out.println("Seu sal�rio l�quido (com descontos do INSS e IRRF) �: " + (salario - 0.11*salario - 0.075*salario));
		
	}

}

package exercicios.ex4;

import java.util.Scanner;

// Elabore um algoritmo que receba o valor do salário de uma pessoa e exiba a quantidade de salaários mínimos que a mesma recebe (Salário mínimo: 954.00)

public class Principal {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		float salario;
		
		System.out.println("Digite o valor do seu salário (caso seja inteiro digite com zeros no final ex:0,00) : ");
		salario = s.nextFloat();
		
		System.out.println("O valor do seu salário equivale a " + (salario/954) + " salários mínimos");
		
	}

}

package exercicios.ex4;

import java.util.Scanner;

// Elabore um algoritmo que receba o valor do sal�rio de uma pessoa e exiba a quantidade de sala�rios m�nimos que a mesma recebe (Sal�rio m�nimo: 954.00)

public class Principal {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		float salario;
		
		System.out.println("Digite o valor do seu sal�rio (caso seja inteiro digite com zeros no final ex:0,00) : ");
		salario = s.nextFloat();
		
		System.out.println("O valor do seu sal�rio equivale a " + (salario/954) + " sal�rios m�nimos");
		
	}

}

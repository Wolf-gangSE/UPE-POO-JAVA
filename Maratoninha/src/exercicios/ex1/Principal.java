package exercicios.ex1;

import java.util.Scanner;

//Elabore um algoritmo que receba um n�mero e imprima o antecessor e o sucessor

public class Principal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		
		System.out.println("Digite um n�mero: ");
		n = s.nextInt();
		
		
		System.out.println("Seu antecessor �: " + (n -1));
		System.out.println("Seu sucessor �: " + (n + 1));
		 
	}
}

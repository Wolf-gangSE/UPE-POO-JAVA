package exercicios.ex2;

import java.util.Scanner;

// Elabore um algoritmo que calcula a média artmética entre 4 notas

public class Principal {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1;
		int n2;
		int n3;
		int n4;
		
		System.out.println("Digite a primeira nota: ");
		n1 = s.nextInt();
		System.out.println("Digite a segunda: ");
		n2 = s.nextInt();
		System.out.println("A terceira: ");
		n3 = s.nextInt();
		System.out.println("A quarta: ");
		n4 = s.nextInt();
		
		System.out.println(" A média artmética das notas é: " + ((n1+n2+n3+n4)/4));
	}
	
}

package exercicios.ex6;

import java.util.Scanner;

/*  Elabore um algoritmo que recebe o nome de um personagem
da Marvel, após isso o sistema informa se é um herói ou vilão.
a) Devem existir ao menos 10 heróis e 10 vilões
b) É preciso armazenar 10 heróis em um vetor
c) É preciso armazenar 10 vilões em um outro vetor
d) Cuidado na diferenciação entre maiúsculas e minúsculas */

public class Principal {
	String herois[] = new String[10];
	public static void main(String[] args) {
		String herois[] = {"Homem-Aranha", "Homem de Ferro", "Capitão América", "Viúva Negra", "Pantera Negra", "Homem-Formiga", "Doutor Estranho", "Hulk", "Thor", "Visão"};
		String viloes[] = {"Doutor Destino", "Ultron", "Magneto", "Thanos", "Apocalipse", "Fênix Negra", "Mistica", "Avalanche", "Caveira Vermelha", "Avalanche"};
		Scanner s = new Scanner(System.in);
		String nome;
		
		
		System.out.println("Digite o nome de um personagem da Marvel: ");
		nome = s.nextLine();
		
		for (String h: herois) {
			if (h.equals(nome)) {
				System.out.println("Este personagem é um héroi!!");
			}
		}
		for (String v: viloes) {
			if (v.equals(nome)) {
				System.out.println("Este personagem é um vilão!!");
			}
		}
			
		
		
	}

}

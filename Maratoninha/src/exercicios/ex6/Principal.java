package exercicios.ex6;

import java.util.Scanner;

/*  Elabore um algoritmo que recebe o nome de um personagem
da Marvel, ap�s isso o sistema informa se � um her�i ou vil�o.
a) Devem existir ao menos 10 her�is e 10 vil�es
b) � preciso armazenar 10 her�is em um vetor
c) � preciso armazenar 10 vil�es em um outro vetor
d) Cuidado na diferencia��o entre mai�sculas e min�sculas */

public class Principal {
	String herois[] = new String[10];
	public static void main(String[] args) {
		String herois[] = {"Homem-Aranha", "Homem de Ferro", "Capit�o Am�rica", "Vi�va Negra", "Pantera Negra", "Homem-Formiga", "Doutor Estranho", "Hulk", "Thor", "Vis�o"};
		String viloes[] = {"Doutor Destino", "Ultron", "Magneto", "Thanos", "Apocalipse", "F�nix Negra", "Mistica", "Avalanche", "Caveira Vermelha", "Avalanche"};
		Scanner s = new Scanner(System.in);
		String nome;
		
		
		System.out.println("Digite o nome de um personagem da Marvel: ");
		nome = s.nextLine();
		
		for (String h: herois) {
			if (h.equals(nome)) {
				System.out.println("Este personagem � um h�roi!!");
			}
		}
		for (String v: viloes) {
			if (v.equals(nome)) {
				System.out.println("Este personagem � um vil�o!!");
			}
		}
			
		
		
	}

}

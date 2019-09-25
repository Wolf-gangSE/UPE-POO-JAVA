package exercicios.ex8;

import java.util.Random;
import java.util.Scanner;

/*  Elabore um algoritmo que inicie um jogo de memoriza��o
a) Existem 4 cores: azul, amarelo, verde e vermelho
b) O sistema do jogo � baseado em turnos, totalizando 10 turnos
c) A cada turno que passa, uma nova cor � sorteada
d) A medida que os turnos surgem, a sequ�ncia � preservada
e) O usu�rio deve digitar o texto referente a cor
f) Caso o usu�rio erre, o jogo encerra
g) O usu�rio vence o jogo se acertar at� o d�cimo turno
h) Cuidado na diferencia��o entre mai�sculas e min�sculas */

public class Principal {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		String cores[] = {"azul", "amarelo", "verde", "vermelho"};
		String cor;
		int controle;
		controle = 0;
		for(int i = 0; i < 10; i++) {
			while (controle == 0) {
				System.out.println("Rodada " + (i+1));
				int n = r.nextInt(cores.length);
				System.out.println("Digite uma cor: ");
				cor = s.nextLine();
				
				if (cor.equals(cores[n])) {
					System.out.println("Voc� acertou!");
				} else {
					System.out.println("Voc� errou!");
					controle = 1;
				}
			}
		}
	}
	

}

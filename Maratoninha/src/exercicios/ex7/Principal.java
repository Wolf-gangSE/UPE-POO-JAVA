package exercicios.ex7;

import java.util.Scanner;

/*  Elabore um algoritmo que inicie um sistema de votação
a) O sistema de votação deve durar 60 segundos
b) o sistema deve receber números entre 0, 1, 2 e qualquer outro
c) se a resposta for 0, o voto é branco
d) se a resposta for 1, o voto é para a chapa 1
e) se a resposta for 2, o voto é para a chapa 2
f) se a resposta for qualquer outro número, o voto é nulo
• No final deve ser informado quem venceu a eleição (chapa 1 ou 2)
• E sumarizar a quantidade de votos para cada opção. */

public class Principal {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String voto;
		
		System.out.println("Bem-vindo(a) ao sistema de votação!");
		System.out.println("           |             |             |                             ");
		System.out.println("[0] Branco | [1] Chapa 1 | [2] Chapa 2 | [Qualquer outro número] Nulo");
		System.out.println("           |             |             |                             ");
		System.out.println("Digite seu voto: ");
		voto = s.nextLine();
		System.out.println("Votação Encerrada!");
		
		if (voto.equals("0")) {
			System.out.println("Seu voto foi branco.");
		} else if (voto.equals("1")) {
			System.out.println("Seu voto foi na chapa 1.");
		} else if (voto.equals("2")) {
			System.out.println("Seu voto foi na chapa 2.");
		} else {
			System.out.println("Seu voto foi nulo.");
		}
	}

}

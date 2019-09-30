package Maratona;
import java.util.Random;
public abstract class Jogo {
	public static int tempo = 90;
	public static int lancesperigo;
	public static int lancespenalti;
	static Time t1 = new Time("São Paulo", 0, 5);
	static Time t2 = new Time("Palmeiras", 0, 4);

	static Random r = new Random();
	public static void main(String[] args) throws InterruptedException{
		for (int i = 0; i < tempo; i++ ) {
			Thread.sleep(1000);
			if (i%5 == 0){
				int n = lanceDePerigo();
				if (n == 0) {
					lancesperigo++;
					continue;

				} else {
					continue;
				}
			}
			if (i % 9 == 0) {
				int p = lanceDePenalti();
				if (p == 3) {
					autorDoLance(t1.fatortecnica, t2.fatortecnica);
					lancespenalti++;
					continue;
				} else {
					continue;
				}
			}
			if (i == 44) {
				eventoIntervalo();
				continue;

			} else {
				System.out.println("A bola está rolando...");
				continue;
			}
		
		}
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println("O jogo acabou!");
		System.out.println(t1.nome + " " + t1.pontos + "  X  " + t2.pontos + " " + t2.nome);
		System.out.println();
		System.out.println("---------------------------------------------------------------------------------------");
	}
	
	public static int lanceDePerigo() { 
		return r.nextInt(2);
	}
	public static int lanceDePenalti() {
		return r.nextInt(5) + 1;
	}
	public static void eventoIntervalo() throws InterruptedException {
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("A partida está em intervalo");
		System.out.println("Resumo do 1° tempo: "+ t1.nome + " " + t1.pontos + "  X  " + t2.pontos + " " + t2.nome);
		System.out.println("Os jogadores estão no vestiário");
		Thread.sleep(5000);
		System.out.println("Os jogadores estão no campo aquecendo");
		Thread.sleep(5000);
		System.out.println("Iniciando o segundo tempo...");
		System.out.println("---------------------------------------------------------------------------------------");
		
	}
	
	public static void autorDoLance(int a, int b) {
		int tecnica1 = a * (r.nextInt(3) + 1);
		int tecnica2 = b * (r.nextInt(3) + 1);
		int fatorTime1 = tecnica1 * (r.nextInt(3) + 1);
		int fatorTime2 = tecnica2 * (r.nextInt(3) + 1);
		if (fatorTime1 > fatorTime2) {
			contabilizarGol(t1.nome);
		} else if (fatorTime2 > fatorTime1) {
			contabilizarGol(t2.nome);
		}else {
		}


	}
	public static void contabilizarGol(String nome) {
		if (nome == "São Paulo") {
			t1.pontos++;
			System.out.println();
			System.out.println("O " + t1.nome + " fez um gol!");
			System.out.println();
		} else {
			t2.pontos++;
			System.out.println();
			System.out.println("O " + t2.nome + " fez um gol!");
			System.out.println();
		}
		
	}
}

package polimorfismo;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("[0] Humano [1] Cachorro [2] Gato");
		String entrada = s.nextLine();
		
		if (entrada.equals("0")) {
			Scanner s0 = new Scanner(System.in);
			System.out.println("Informe o nome do humano:");
			String entrada0 = s0.nextLine();
			Humano h = new Humano(true);
			h.setNome(entrada0);
			h.tipificar();
			h.andar();
			h.Racionalizar();
		}
	
		if (entrada.equals("1")) {
			Scanner s1 = new Scanner(System.in);
			System.out.println("Informe o nome do cachorro:");
			String entrada1 = s1.nextLine();
			Cachorro c = new Cachorro(false);
			c.setNome(entrada1);
			c.tipificar();
			c.andar();
			c.Racionalizar();
		}
		
		if (entrada.equals("2")) {
			Scanner s2 = new Scanner(System.in);
			System.out.println("Informe o nome do gato: ");
			String entrada2 = s2.nextLine();
			Gato g = new Gato(false);
			g.setNome(entrada2);
			g.tipificar();
			g.andar();
			g.Racionalizar();
			
		}
		
	}
	
}

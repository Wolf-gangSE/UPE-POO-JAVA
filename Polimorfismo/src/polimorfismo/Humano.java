package polimorfismo;

public class Humano extends Animal implements Terrestre {

	public Humano(Boolean isracional) {
		super(true);
	}

	public void andar() {
		System.out.println(this.getNome() + " se locomove com 2 pernas.");
	}

	public void tipificar() {
		System.out.println(this.getNome() + " é um humano.");
	}

}

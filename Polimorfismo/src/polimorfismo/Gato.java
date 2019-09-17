package polimorfismo;

public class Gato extends Animal implements Terrestre {

	public Gato(Boolean isracional) {
		super(false);

	}
	public void andar() {
		System.out.println(this.getNome() + " se locomove com 4 patas.");
	}

	public void tipificar() {
		System.out.println(this.getNome() + " é um gato.");
	}


}

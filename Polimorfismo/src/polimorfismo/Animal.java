package polimorfismo;

public abstract class Animal extends Principal {
	public String nome;
	public Boolean racional;
	
	public Animal(Boolean isracional) {
		this.racional = isracional;
	}
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void Racionalizar() {
		if (this.racional.equals(true)) {
			System.out.println(this.getNome() + " é um animal racional.");
		}
		if (this.racional.equals(false)) {
			System.out.println(this.getNome() + " é um animal irracional.");
		}
	}
	

}

package entidades;

public abstract class Pessoa {
	private String nome;
	private Double renda_anual;
	
	public Pessoa() {
	}
	
	public Pessoa(String nome, Double renda_anual) {
		this.nome = nome;
		this.renda_anual = renda_anual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRenda_anual() {
		return renda_anual;
	}

	public void setRenda_anual(Double renda_anual) {
		this.renda_anual = renda_anual;
	}	
	
	abstract Double imposto();
	
	public Double getImposto() {
		return imposto();
	}
	
	@Override
	public String toString() {
		return String.format("%s: R$%.2f", getNome(), imposto());
	}
}//class Pessoa

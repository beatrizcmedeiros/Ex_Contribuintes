package entidades;

public class PessoaJuridica extends Pessoa{
	private int numero_funcionarios;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double renda_anual, int numero_funcionarios) {
		super(nome, renda_anual);
		this.numero_funcionarios = numero_funcionarios;
	}

	public int getNumero_funcionarios() {
		return numero_funcionarios;
	}

	public void setNumero_funcionarios(int numero_funcionarios) {
		this.numero_funcionarios = numero_funcionarios;
	}

	@Override
	Double imposto() {
		Double imposto = null;
		if(getNumero_funcionarios() < 10) 
			imposto = getRenda_anual()*0.16;
		else 
			imposto = getRenda_anual()*0.14;
		
		return imposto;
	}
}//class PessoaJuridica

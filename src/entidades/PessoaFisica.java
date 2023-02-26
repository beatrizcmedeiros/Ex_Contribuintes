package entidades;

public class PessoaFisica extends Pessoa{
	private Double gastos_saude;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double renda_anual, Double gastos_saude) {
		super(nome, renda_anual);
		this.gastos_saude = gastos_saude;
	}

	public Double getGastos_saude() {
		return gastos_saude;
	}

	public void setGastos_saude(Double gastos_saude) {
		this.gastos_saude = gastos_saude;
	}

	@Override
	Double imposto() {
		Double imposto = null;
		if(getRenda_anual() < 20000) 
			imposto = getRenda_anual()*0.15;
		else 
			imposto = getRenda_anual()*0.25;
		
		if(gastos_saude > 0)
			imposto = imposto - (getGastos_saude()*0.50);
		
		return imposto;
	}
}//class PessoaFisica

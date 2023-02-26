package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Pessoa;
import entidades.PessoaFisica;
import entidades.PessoaJuridica;

public class Programa {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		System.out.println("Informe a quantidade de pessoas que pagarão imposto: ");
		int qtd_pessoas = sc.nextInt();
		
		for(int i = 1; i <= qtd_pessoas; i++) {
			System.out.printf("\nDados da pessoa %d:", i);
			
			System.out.print("\nÉ uma pessoa física ou jurídica (f/j)? ");
			char pessoa = sc.next().charAt(0);
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Renda anual: ");
			Double renda_anual = sc.nextDouble();
			
			if(pessoa == 'f') {
				System.out.print("Gastos com saúde: ");
				Double gastos_saude = sc.nextDouble();
				
				pessoas.add(new PessoaFisica(nome, renda_anual, gastos_saude));
			}
			
			if(pessoa == 'j') {
				System.out.print("Número de funcionários: ");
				int qtd_funcionarios = sc.nextInt();
				
				pessoas.add(new PessoaJuridica(nome, renda_anual, qtd_funcionarios));
			}
		}
		
		Double total_taxas = 0.0;
		System.out.println("\nImpostos pagos: ");
		for(Pessoa p : pessoas) {
			System.out.println(p.toString());
			total_taxas += p.getImposto();
		}
		
		System.out.printf("\nTOTAL DE IMPOSTOS: R$ %.2f", total_taxas);
		
		sc.close();
	}
}//class Programa

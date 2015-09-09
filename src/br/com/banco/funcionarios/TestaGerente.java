package br.com.banco.funcionarios;

public class TestaGerente {
	
	public static void main(String[] args) {
		
		Gerente gerente_senior = new Gerente();
		
		Gerente gerente_marcia = new Gerente();
		gerente_marcia.setNome("Marcia");
		gerente_marcia.setSalario(2000.00);
		gerente_marcia.setGestor(new Gerente());
		
		
		System.out.println("Antes do Bonus: " + gerente_marcia.recuperarInformacoes());
		gerente_senior.ajustarBonificacao(gerente_marcia, 10);
		System.out.println("Depois do Bonus: " + gerente_marcia.recuperarInformacoes());
		
		
		
	}

}

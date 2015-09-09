package br.com.banco.funcionarios;

public class TestaGerdorDeRelatorio {
	
	public static void main(String[] args) {
		Gerente gerente_senior = new Gerente();

		Gerente gerente_marcia = new Gerente();
		gerente_marcia.setNome("Marcia");
		gerente_marcia.setSalario(2000.00);
		gerente_marcia.setGestor(new Gerente());
		gerente_senior.ajustarBonificacao(gerente_marcia, 10);

		GeradorDeRelatorio geradorDeRelatorio = new GeradorDeRelatorio();
		
		Faxineira faxineira = new Faxineira();
		faxineira.setNome("Tarcilia");
		faxineira.setSalario(1000);
		
		geradorDeRelatorio.imprime(gerente_marcia);
		geradorDeRelatorio.imprime(faxineira);
		
	}
}

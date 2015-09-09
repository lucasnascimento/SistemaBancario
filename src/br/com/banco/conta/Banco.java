package br.com.banco.conta;

public class Banco {

	public static final int MAX_CONTAS = 10;

	private int quantidadeDeContas = 0;

	Conta[] contas = new Conta[MAX_CONTAS];

	public void adicionaConta(Conta c) {
		if (quantidadeDeContas <= MAX_CONTAS) {
			contas[quantidadeDeContas++] = c;
		}
	}

	public Conta pegaConta(int x) {
		if (x < quantidadeDeContas)
			return contas[x];
		else return null;
	}
	
	public int pegaTotalDeContas(){
		return quantidadeDeContas;
	}

}

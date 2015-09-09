package br.com.banco.conta;

public class AtualizadorDeContas {
	private double saldoTotal = 0;
	private double selic;

	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}

	public void roda(Conta c) {
		// aqui você imprime o saldo anterior, atualiza a conta,
		System.out.println(c.saldo);
		// e depois imprime o saldo final
		c.atualiza(selic);
		System.out.println(c.saldo);
		// lembrando de somar o saldo final ao atributo saldoTotal
		this.saldoTotal += c.saldo;
	}

	public double getSaldoTotal() {
		return saldoTotal;
	}
	

}

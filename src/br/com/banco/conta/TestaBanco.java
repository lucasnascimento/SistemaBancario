package br.com.banco.conta;

public class TestaBanco {
	
	public static void main(String[] args) {
		
		Banco banco = new Banco();
		
		Conta c = new Conta();
		c.deposita(1000);
		
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(1000);
		
		ContaPoupanca cp = new ContaPoupanca();
		cp.deposita(1000);
		
		banco.adicionaConta(c);
		banco.adicionaConta(cp);
		banco.adicionaConta(cc);
		
		AtualizadorDeContas atualizadorDeContas = new AtualizadorDeContas(0.1);
		
		for (int i = 0; i < banco.pegaTotalDeContas(); i++) {
			atualizadorDeContas.roda(banco.pegaConta(i));
		}
		
		System.out.println(atualizadorDeContas.getSaldoTotal());
		
 	}

}

package br.com.banco.funcionarios;

public class GeradorDeRelatorio {

	public void imprime(Funcionario funcionario) {
		
		String mensagemExtra = "";
		if (funcionario instanceof Bonificavel) {
			mensagemExtra = " - Bonificavel em: " + ((Bonificavel) funcionario).recuperarBonificacao();
		}
		
		System.out.println(funcionario.recuperarInformacoes() + mensagemExtra );
	}

}

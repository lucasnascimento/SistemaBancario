package br.com.banco.funcionarios;

public class Gerente extends Funcionario implements Bonificavel{
	
	private int quantidadeSubordinados;
	
	public String recuperarInformacoes() {
		return super.recuperarInformacoes() + " é um GERENTE";
	}
	
	public int getQuantidadeSubordinados() {
		return quantidadeSubordinados;
	}
	public void setQuantidadeSubordinados(int quantidadeSubordinados) {
		this.quantidadeSubordinados = quantidadeSubordinados;
	}
	
	public boolean ajustarBonificacao(Funcionario funcionario, double indice){
		if(funcionario.getGestor().equals(this)){
			funcionario.setIndiceBonus(indice);
			return true;
		}else{
			return false;
		}
	}

	@Override
	public double recuperarBonificacao() {
		return super.cacularRemuneracao() - this.getSalario();
	}
	
	

}

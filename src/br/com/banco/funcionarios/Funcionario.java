package br.com.banco.funcionarios;

public class Funcionario extends Usuario {

	private String nome;
	private String cpf;
	private double salario;
	private double indiceBonus;
	private Funcionario gestor;

	public String recuperarInformacoes() {
		StringBuilder sb = new StringBuilder();
		sb.append("nome: ").append(this.nome).append(" remuneracao: ")
				.append(this.cacularRemuneracao());
		return sb.toString();
	}

	public double cacularRemuneracao() {
		return salario * (1 + (indiceBonus / 100));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getIndiceBonus() {
		return indiceBonus;
	}

	public void setIndiceBonus(double indiceBonus) {
		this.indiceBonus = indiceBonus;
	}

	public Funcionario getGestor() {
		return gestor;
	}

	public void setGestor(Funcionario gestor) {
		this.gestor = gestor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		long temp;
		temp = Double.doubleToLongBits(indiceBonus);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		temp = Double.doubleToLongBits(salario);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (Double.doubleToLongBits(indiceBonus) != Double
				.doubleToLongBits(other.indiceBonus))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(salario) != Double
				.doubleToLongBits(other.salario))
			return false;
		return true;
	}

}

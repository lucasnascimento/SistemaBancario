package br.com.banco.funcionarios;

public class Usuario {
	
	private int senha;
	
	public boolean autenticar(int senha){
		if (this.senha == senha){
			return true;
		}else{
			return false;
		}
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

}

package exerciciosOrientacaoObjetos;

public class Funcionario {
	
	private String nomeCompleto; 
	private String cargo;
	private String email;
	private String qualOperacao;
	
	
	public Funcionario (String nomeCompleto, String cargo, String qualOperacao, String email)
	{		
		this.nomeCompleto = nomeCompleto;
		this.cargo= cargo;
		this.email= email;
		this.qualOperacao=qualOperacao;
		
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQualOperacao() {
		return qualOperacao;
	}

	public void setQualOperacao(String qualOperacao) {
		this.qualOperacao = qualOperacao;
	}

}



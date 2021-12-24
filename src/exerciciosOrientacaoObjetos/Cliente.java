package exerciciosOrientacaoObjetos;

public class Cliente {
	
	private String nomeCompleto;
	private String email;
	private String endereco;
	
	public Cliente (String nomeCompleto, String email, String endereco) {
		
		this.nomeCompleto = nomeCompleto;
		this.email= email;
		this.endereco= endereco;
	}
	
	public String getUsuario()
	{
		String usuario= nomeCompleto + ", " + email + ", " + endereco;
		return usuario;
	}
}

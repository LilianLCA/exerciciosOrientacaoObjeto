package exerciciosOrientacaoObjetos;

public class ClienteExemplo {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Lilian Assun��o", "lilian@gmail.com", "Rua Clemente Argolo");
		System.out.println(cliente.getUsuario());
	}

}

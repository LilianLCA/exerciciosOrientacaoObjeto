package exerciciosOrientacaoObjetos;

public class FuncionarioExemplo {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario("Lilian Assunção", "lilian@gmailcom", "Instrutora de Treinamento", "Bluelink");
		
			
			System.out.println(funcionario1.getNomeCompleto());
			
			System.out.println(funcionario1.getEmail());
			
			System.out.println(funcionario1.getCargo());
			
			System.out.println(funcionario1.getQualOperacao());
		}

	}


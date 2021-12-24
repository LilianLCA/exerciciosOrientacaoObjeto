package exerciciosOrientacaoObjetos;

import java.util.Scanner;

public class Preguica {

	public static void main(String[] args) {
		
		
		Animal preguica = new Animal();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o nome da pregui�a: ");
		preguica.setNome(in.next());
		System.out.println("Digite a idade pregui�a: ");
		preguica.setIdade(in.nextInt());
		
		in.close();
		
		System.out.println("\nO nome da pregui�a �: "+preguica.getNome());
		System.out.println("A idade da pregui�a �: "+preguica.getIdade());
		System.out.println("A pregui�a emite som? "+preguica.isSom());
		System.out.println("A pregui�a esta subindo em uma �rvore");

	}

}

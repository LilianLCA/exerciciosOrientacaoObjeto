package exerciciosOrientacaoObjetos;

import java.util.Scanner;

public class Preguica {

	public static void main(String[] args) {
		
		
		Animal preguica = new Animal();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o nome da preguiça: ");
		preguica.setNome(in.next());
		System.out.println("Digite a idade preguiça: ");
		preguica.setIdade(in.nextInt());
		
		in.close();
		
		System.out.println("\nO nome da preguiça é: "+preguica.getNome());
		System.out.println("A idade da preguiça é: "+preguica.getIdade());
		System.out.println("A preguiça emite som? "+preguica.isSom());
		System.out.println("A preguiça esta subindo em uma árvore");

	}

}

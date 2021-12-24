package exerciciosOrientacaoObjetos;

import java.util.Scanner;

public class Cavalo {

	public static void main(String[] args) {
		
		
		Animal cavalo = new Animal();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o nome do cavalo: ");
		cavalo.setNome(in.next());
		System.out.println("Digite a idade do cavalo: ");
		cavalo.setIdade(in.nextInt());
		
		in.close();
		
		System.out.println("O nome o cavalo é: "+cavalo.getNome());
		System.out.println("A idade do cavalo é: "+cavalo.getIdade());
		System.out.println("O cavalo emite som? "+cavalo.isSom());
		cavalo.getCorrer();

	}

}

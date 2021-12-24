package exerciciosOrientacaoObjetos;

import java.util.Scanner;

public class Cachorro {
	
	public static void main(String[]args) {
		
		Animal cachorro = new Animal();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o nome do seu cachorro: ");
		cachorro .setNome(in.next());
		System.out.println("Digite a idade do seu cachorro: ");
		cachorro .setIdade(in.nextInt());
		cachorro .setSom(in.hasNextBoolean());
		
		
		in.close();
		
		System.out.println("O nome o cachorro é: "+cachorro.getNome());
		System.out.println("A idade do cachorro é: "+cachorro.getIdade());
		System.out.println("O cachorro emite som? "+cachorro.isSom());
		System.out.println("O cachorro esta correndo"+cachorro.getCorrer());	
	}
}

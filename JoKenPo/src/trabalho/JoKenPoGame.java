package trabalho;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class JoKenPoGame {

	public static void main(String[] args) throws InterruptedException {


		int jogador;
		int computador;
		
		Scanner clique = new Scanner(System.in);

		
		System.out.println("  JOKENPO   ");
		System.out.println(" ");
		System.out.println("1 - PEDRA \n2 - PAPEL\n3 - TESOURA");
		System.out.println(" ");
		
		//jogador
		
		do {
			System.out.println("Digite a opção desejada:");
			jogador = clique.nextInt();
			System.out.println(" ");
			
			switch(jogador) {
			case 1:
				System.out.println("Jogador escolheu PEDRA");
				break;
			case 2:
				System.out.println("Jogador escolheu PAPEL");
				break;
			case 3:
				System.out.println("Jogador escolheu TESOURA");
				break;
			default:
				System.out.println("Opção Inválida");
				System.out.println(" ");
				
			}
			// se o jogador escolher um op diferente de 1,2,3, da opção inválida e retorna ao menu de escolha
		} while (jogador !=1 && jogador !=2 && jogador !=3);
		clique.close();
		
//		//COMPUTADOR
		TimeUnit.SECONDS.sleep(01); //colocar a computador pra dormir por um segundo para que a mensagem que ira aparecer não aparecer logo de uma vez
		computador = (int)(Math.random() * 3 + 1); 
		
		switch (computador) {
		case 1:
			System.out.println("Computador escolheu PEDRA");
			break;
		case 2:
			System.out.println("Computador escolheu PAPEL");
			break;
		case 3:
			System.out.println("Computador escolheu TESOURA");
			break;
			
		}
		//DEFININDNO VENCEDOR
		TimeUnit.SECONDS.sleep(01);
		if (jogador == computador) {
			System.out.println(" ");
			System.out.println("EMPATE!!");
			
		}else {
			if (jogador == 1 && computador == 3 || jogador == 2 && computador == 1 || jogador == 3 && computador == 2 ) {
				System.out.println(" ");
				System.out.println("JOGADOR VENCEU!!");
				
			} else {
				System.out.println(" ");
				System.out.println("COMPUTADOR VENCEU!!");
			}
		}
		
		

	}

}



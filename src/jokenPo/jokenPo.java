package jokenPo;

import java.util.Scanner;

public class jokenPo {

	public static void main(String[] args) {

		//declaração de variáveis
		int player1, player2;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("----------------JokenPo------------------");
		System.out.println("");
		System.out.println("1. Rock");
		System.out.println("2. Paper");
		System.out.println("3. Scissors");
		System.out.println("Enter the desired option: ");

		// lógica do jogador1

		player1 = keyboard.nextInt();
		System.out.println("");

		switch (player1) {
		case 1:
			System.out.println("Player 1 chose ROCK");
			break;
		case 2:
			System.out.println("Player 1 chose PAPER");
			break;
		case 3:
			System.out.println("Player 1 chose SCISSORS");
			break;
		default:
			System.out.println("Option invalid");
		}

		// lógica do jogador2

		player2 = (int) (Math.random() * 3 + 1);
		keyboard.close();
		switch (player2) {
		case 1:
			System.out.println("Player 2 chose ROCK");
			break;
		case 2:
			System.out.println("Player 2 chose PAPER");
			break;
		case 3:
			System.out.println("Player 2 chose SCISSORS");
			break;
		}

		// lógica para definir o vencedor

		System.out.println("");
		if (player1 == player2) {
			System.out.println("TIE");
		} else {
			if ((player1 == 1 && player2 == 3) || (player1 == 2 && player2 == 1) || (player1 == 3 && player2 == 2)) {
				System.out.println("Player 1 wins");
			} else {
				System.out.println("Player 2 wins");
			}
		}
	}
}




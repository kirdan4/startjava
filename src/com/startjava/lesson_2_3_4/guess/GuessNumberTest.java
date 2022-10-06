package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		String reply = "yes";
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите имя игрока 1:");
		Player player1 = new Player(scan.nextLine());
		System.out.println("Введите имя игрока 2:");
		Player player2 = new Player(scan.nextLine());
		System.out.println("Введите имя игрока 3:");
		Player player3 = new Player(scan.nextLine());
		GuessNumber game = new GuessNumber(player1, player2, player3);
		do {
			if ("yes".equals(reply)) {
				game.start();
			}
			System.out.println("Хотите продолжить игру? [yes/no]");
			reply = scan.nextLine();
		} while (!"no".equals(reply));
	}
}
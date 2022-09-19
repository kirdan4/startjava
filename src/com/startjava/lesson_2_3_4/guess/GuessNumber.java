package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
	private final Player player1;
	private final Player player2;
	private int hiddenNumber;

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void start() {
		init();
		Scanner scan = new Scanner(System.in);
		hiddenNumber = (int) (Math.random() * 100) + 1;
		System.out.println("У каждого игрока по 10 попыток.");
		while (true) {
			enterNumber(player1, scan);
			if (isGuessed(player1)) {
				break;
			}
			if (hasAttempts(player1)) {
				System.out.printf("У игрока %s закончились попытки.\n", player1.getName());
			}
			enterNumber(player2, scan);
			if (isGuessed(player2)) {
				break;
			}
			if (hasAttempts(player2)) {
				System.out.printf("У игрока %s закончились попытки.\n", player2.getName());
				break;
			}
		}
		printEnteredNumbers(player1, player1.getEnteredNumbers());
		printEnteredNumbers(player2, player2.getEnteredNumbers());
	}

	private void init() {
		player1.resetNumbers();
		player2.resetNumbers();
		player1.setCountAttempts(0);
		player2.setCountAttempts(0);
	}

	private void enterNumber(Player player, Scanner scan) {
		System.out.printf("Ходит %s. Введи число от 1 до 100:\n", player.getName());
		player.addNumber(scan.nextInt());
	}

	private boolean isGuessed(Player player) {
		if (player.getLastNumber() == hiddenNumber) {
			System.out.printf("Игрок %s угадал число %d с %d попытки.\n", player.getName(),
					player.getLastNumber(), player.getCountAttempts());
			return true;
		}
		System.out.printf("Твоё число %d. Загаданное число " + (player.getLastNumber() > hiddenNumber ?
						"меньше.\n" : "больше.\n"),
				player.getLastNumber());
		return false;
	}

	private boolean hasAttempts(Player player) {
		return player.getCountAttempts() > 9;
	}

	private void printEnteredNumbers(Player player, int[] numbers) {
		System.out.printf("Числа названные игроком %s: ", player.getName());
		for(int number : numbers) {
			System.out.print(number + " ");
		}
		System.out.println();
	}
}
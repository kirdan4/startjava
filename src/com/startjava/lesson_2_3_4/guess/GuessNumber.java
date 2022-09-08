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
		resetEnteredNumbers(player1);
		resetEnteredNumbers(player2);
		resetCountAttempts(player1);
		resetCountAttempts(player2);
		Scanner scan = new Scanner(System.in);
		hiddenNumber = (int) (Math.random() * 100) + 1;
		System.out.println("У каждого игрока по 10 попыток.");
		while (true) {
			if (checkLimitAttempts(player1) || checkLimitAttempts(player2)) {
				break;
			}
			System.out.printf("Ходит %s. Введи число от 1 до 100:\n", player1.getName());
			player1.addNumber(scan.nextInt());
			if (isGuessed(player1)) {
				break;
			}
			System.out.printf("Ходит %s. Введи число от 1 до 100: \n", player2.getName());
			player2.addNumber(scan.nextInt());
			if (isGuessed(player2)) {
				break;
			}
		}
		System.out.printf("Числа названные игроком %s: ", player1.getName());
		printEnteredNumbers(player1.getEnteredNumbers());
		System.out.printf("Числа названные игроком %s: ", player2.getName());
		printEnteredNumbers(player2.getEnteredNumbers());
	}

	private void resetEnteredNumbers(Player player) {
		if (player.getCountAttempts() != 0) {
			player.resetNumbers();
		}
	}

	private void resetCountAttempts(Player player) {
		if (player.getCountAttempts() != 0) {
			player.setCountAttempts(0);
		}
	}

	private boolean checkLimitAttempts(Player player) {
		if (player.getCountAttempts() > 9) {
			System.out.printf("У игрока %s закончились попытки.\n", player.getName());
			return true;
		}
		return false;
	}

	private boolean isGuessed(Player player) {
		if (player.getLastNumber() == hiddenNumber) {
			System.out.printf("Игрок %s угадал число %d с %d попытки.\n", player.getName(),
					player.getLastNumber(), (player.getCountAttempts() + 1));
			player.incCountAttempts();
			return true;
		}
		System.out.printf(player.getLastNumber() > hiddenNumber ?
						"Твоё число %d. Загаданное число меньше.\n" : "Твоё число %d. Загаданное число больше.\n",
				player.getLastNumber());
		player.incCountAttempts();
		return false;
	}

	private void printEnteredNumbers(int[] numbers) {
		for(int number : numbers) {
			System.out.print(number + " ");
		}
		System.out.println();
	}
}
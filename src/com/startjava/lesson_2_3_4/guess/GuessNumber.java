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
		resetPlayerNumbersStorage(player1);
		resetPlayerNumbersStorage(player2);
		resetAttemptsPlayer(player1);
		resetAttemptsPlayer(player2);
		Scanner scan = new Scanner(System.in);
		hiddenNumber = (int) (Math.random() * 100) + 1;
		System.out.println("У каждого игрока по 10 попыток.");
		while (true) {
			if (checkLimitAttempts(player1) || checkLimitAttempts(player2)) {
				break;
			}
			System.out.printf("Ходит %s. Введи число от 1 до 100:\n", player1.getName());
			player1.setPlayerNumberToStorage(scan.nextInt());
			if (numberIsGuessed(player1)) {
				break;
			}
			numberNotGuessed(player1);
			System.out.printf("Ходит %s. Введи число от 1 до 100: \n", player2.getName());
			player2.setPlayerNumberToStorage(scan.nextInt());
			if (numberIsGuessed(player2)) {
				break;
			}
			numberNotGuessed(player2);
		}
		System.out.printf("Числа названные игроком %s: ", player1.getName());
		printNumbersPlayer(player1.getNumbersNamedPlayer());
		System.out.printf("Числа названные игроком %s: ", player2.getName());
		printNumbersPlayer(player2.getNumbersNamedPlayer());
	}

	private void resetPlayerNumbersStorage(Player player) {
		if (player.getAttemptsPlayer() != 0) {
			player.zeroingStorageNumbersPlayer();
		}
	}

	private void resetAttemptsPlayer(Player player) {
		if (player.getAttemptsPlayer() != 0) {
			player.setAttemptsPlayer(0);
		}
	}

	private boolean checkLimitAttempts(Player player) {
		if (player.getAttemptsPlayer() > 9) {
			System.out.printf("У игрока %s закончились попытки.\n", player.getName());
			return true;
		}
		return false;
	}
	private boolean numberIsGuessed(Player player) {
		if (player.getValueFromStorage() == hiddenNumber) {
			System.out.printf("Игрок %s угадал число %d с %d попытки.\n", player.getName(),
					player.getValueFromStorage(), (player.getAttemptsPlayer() + 1));
			player.incAttemptsPlayer();
			return true;
		}
		return false;
	}
	private void numberNotGuessed(Player player) {
		System.out.printf(player.getValueFromStorage() > hiddenNumber ?
						"Твоё число %d. Загаданное число меньше.\n" : "Твоё число %d. Загаданное число больше.\n",
				player.getValueFromStorage());
		player.incAttemptsPlayer();
	}

	private void printNumbersPlayer(int[] nums) {
		for(int num : nums) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
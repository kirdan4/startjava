package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
	private final Player player1;
	private final Player player2;

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void start() {
		resetArrays();
		resetCountPlayers();
		Scanner scan = new Scanner(System.in);
		int hiddenNumber = (int) (Math.random() * 100) + 1;
		System.out.println("У каждого игрока по 10 попыток.");
		while (true) {
			if (!player1.checkAttempts() || !player2.checkAttempts()) {
				break;
			}
			System.out.printf("Ходит %s. Введи число от 1 до 100:\n", player1.getName());
			player1.setIndexArray(player1.getCountPlayer(), scan.nextInt());
			if (player1.getIndexArray(player1.getCountPlayer()) == hiddenNumber) {
				System.out.printf("Игрок %s угадал число %d с %d попытки.\n", player1.getName(),
						player1.getIndexArray(player1.getCountPlayer()), (player1.getCountPlayer() + 1));
				player1.incCountPlayer();
				break;
			}
			System.out.printf(player1.getIndexArray(player1.getCountPlayer()) > hiddenNumber ?
							"Твоё число %d. Загаданное число меньше.\n" : "Твоё число %d. Загаданное число больше.\n",
					player1.getIndexArray(player1.getCountPlayer()));
			player1.incCountPlayer();
			System.out.printf("Ходит %s. Введи число от 1 до 100: \n", player2.getName());
			player2.setIndexArray(player2.getCountPlayer(), scan.nextInt());
			if (player2.getIndexArray(player2.getCountPlayer()) == hiddenNumber) {
				System.out.printf("Игрок %s угадал число %d с %d попытки.\n", player2.getName(),
						player2.getIndexArray(player2.getCountPlayer()), (player2.getCountPlayer() + 1));
				player2.incCountPlayer();
				break;
			}
			System.out.printf(player2.getIndexArray(player2.getCountPlayer()) > hiddenNumber ?
							"Твоё число %d. Загаданное число меньше.\n" : "Твоё число %d. Загаданное число больше.\n",
					player2.getIndexArray(player2.getCountPlayer()));
			player2.incCountPlayer();
		}
		System.out.printf("Числа названные игроком %s: ", player1.getName());
		player1.printArray(player1.getAllArray());
		System.out.printf("Числа названные игроком %s: ", player2.getName());
		player1.printArray(player2.getAllArray());
	}

	private void resetArrays() {
		if (player1.getCountPlayer() != 0) {
			player1.zeroingArray();
		}
		if (player2.getCountPlayer() != 0) {
			player2.zeroingArray();
		}
	}

	private void resetCountPlayers() {
		if (player1.getCountPlayer() != 0) {
			player1.setCountPlayer(0);
		}
		if (player2.getCountPlayer() != 0) {
			player2.setCountPlayer(0);
		}
	}
}
package com.startjava.lesson_2_3_4.guess;

import java.util.*;

public class GuessNumber {
	private final Player[] players;
	private int hiddenNumber;
	static final int NUMBER_OF_ROUNDS = 3;
	static final int LIMIT_ATTEMPTS = 10;

	public GuessNumber(Player... players) {
		this.players = players;
	}

	public void start() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Победитель определяется по результатам 3 раундов, " +
				"в каждом из которых у игроков по 10 попыток.");
		castLots();
		for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
			init();
			hiddenNumber = (int) (Math.random() * 10) + 1;
			System.out.println("Раунд " + (i + 1) + ".");
			while (true) {
				if (startGameplay(scan)) {
					break;
				}
			}
			printPlayersAttempts();
		}
		findWinner();
		resetWins();
	}

	private void castLots() {
		for (int i = 0; i < players.length; i++) {
			int index = (int) (Math.random() * (i + 1));
			Player temp = players[i];
			players[i] = players[index];
			players[index] = temp;
		}
	}

	private void init() {
		for (Player player : players) {
			player.resetNumbers();
			player.setCountAttempts(0);
		}
	}

	public boolean startGameplay(Scanner scan) {
		for (int i = 0; i < players.length; i++) {
			try {
				if (makeMove(players[i], scan)) {
					return true;
				}
			} catch (IllegalArgumentException e) {
				System.out.println("Введено некорректное число. Числа должны быть от 1 до 100.");
			}
			if (hasAttempts(players[i])) {
				System.out.printf("У игрока %s закончились попытки.\n", players[i].getName());
				if (i == (players.length - 1)) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean makeMove(Player player, Scanner scan) {
		enterNumber(scan, player);
		return isGuessed(player);
	}

	private void enterNumber(Scanner scan, Player player) {
		System.out.printf("Ходит %s. Введи число от 1 до 10:\n", player.getName());
		player.addNumber(scan.nextInt());
	}

	private boolean isGuessed(Player player) {
		int lastNumber = player.getLastNumber();
		if (lastNumber == hiddenNumber) {
			System.out.printf("Игрок %s угадал число %d с %d попытки.\n", player.getName(),
					lastNumber, player.getCountAttempts());
			player.incCountWins();
			return true;
		}
		System.out.printf("Твоё число %d. Загаданное число " +
						(lastNumber > hiddenNumber ? "меньше.\n" : "больше.\n"), lastNumber);
		return false;
	}

	private boolean hasAttempts(Player player) {
		return player.getCountAttempts() >= LIMIT_ATTEMPTS;
	}

	private void printPlayersAttempts() {
		for (Player player : players) {
			System.out.printf("Числа названные игроком %s: ", player.getName());
			for (int number: player.getEnteredNumbers()) {
				System.out.print(number + " ");
			}
			System.out.println();
		}
	}

	private void printCountWins() {
		for (Player player : players) {
			System.out.printf("Число побед игрока %s: %d.\n", player.getName(), player.getCountWins());
		}
	}

	private void findWinner() {
		Arrays.sort(players);
		if (Objects.equals(players[0].getCountWins(), players[1].getCountWins())) {
			System.out.println("По результатам 3 раундов ничья.");
			printCountWins();
		} else {
			System.out.printf("По результатам 3 раундов победил игрок %s, " +
					"количество побед %d.\n", players[0].getName(), players[0].getCountWins());
		}
	}

	private void resetWins() {
		for (Player player : players) {
			player.setCountWins(0);
		}
	}
}
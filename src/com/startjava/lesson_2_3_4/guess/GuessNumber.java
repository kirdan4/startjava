package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;

public class GuessNumber {
	private final Player[] players;
	private int hiddenNumber;

	public GuessNumber(Player... players) {
		this.players = players;
	}

	public void start() {
		System.out.println("Победитель определяется по результатам 3 раундов, в каждом из которых у игроков по 10 попыток.");
		shufflePlayers(players);
		for (int i = 0; i < 3; i++) {
			init(players);
			Scanner scan = new Scanner(System.in);
			hiddenNumber = (int) (Math.random() * 100) + 1;
			System.out.println("Раунд " + (i + 1) + ".");
			loop:while (true) {
				for (int j = 0; j < players.length; j++) {
					try {
						if (makeMove(players[j], scan)) {
							break loop;
						}
					} catch (IllegalArgumentException e) {
						System.out.println(e.getMessage());
					}
					if (hasAttempts(players[j])) {
						System.out.printf("У игрока %s закончились попытки.\n", players[j].getName());
						if (j == (players.length - 1)) {
							break loop;
						}
					}
				}
			}
			printEnteredNumbersPlayers(players);
		}
		sortPlayersByWins(players);
		if (Objects.equals(players[0].getCountWins(), players[1].getCountWins())) {
			System.out.println("По результатам 3 раундов ничья.");
			printCountWins(players);
		} else {
			System.out.printf("По результатам 3 раундов победил игрок %s, " +
					"количество побед %d.\n", players[0].getName(), players[0].getCountWins());
		}
		resetWins(players);
	}

	private void shufflePlayers(Player[] players) {
		for (int i = 0; i < players.length; i++) {
			int random = (int) (Math.random() * (i + 1));
			Player temp = players[i];
			players[i] = players[random];
			players[random] = temp;
		}
	}

	private void init(Player[] players) {
		for (Player player : players) {
			player.resetNumbers();
			player.setCountAttempts(0);
		}
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
		if (player.getLastNumber() == hiddenNumber) {
			System.out.printf("Игрок %s угадал число %d с %d попытки.\n", player.getName(),
					player.getLastNumber(), (player.getCountAttempts() + 1));
			player.incCountAttempts();
			player.incCountWins();
			return true;
		}
		System.out.printf("Твоё число %d. " + (player.getLastNumber() > hiddenNumber ?
						"Загаданное число меньше.\n" : "Загаданное число больше.\n"),
				player.getLastNumber());
		player.incCountAttempts();
		return false;
	}

	private boolean hasAttempts(Player player) {
		return player.getCountAttempts() > 9;
	}

	private void printEnteredNumbersPlayers(Player[] players) {
		for (Player player : players) {
			System.out.printf("Числа названные игроком %s: ", player.getName());
			printEnteredNumbers(player.getEnteredNumbers());
		}
	}

	private void printEnteredNumbers(int[] numbers) {
		for(int number : numbers) {
			System.out.print(number + " ");
		}
		System.out.println();
	}

	private void sortPlayersByWins(Player[] players) {
		Comparator<Player> comparator = (o2, o1) -> o1.getCountWins().compareTo(o2.getCountWins());
		Arrays.sort(players, comparator);
	}

	private void printCountWins(Player[] players) {
		for (Player player : players) {
			System.out.printf("Число побед игрока %s: %d.\n", player.getName(), player.getCountWins());
		}
	}

	private void resetWins (Player[] players) {
		for (Player player : players) {
			player.setCountWins(0);
		}
	}
}
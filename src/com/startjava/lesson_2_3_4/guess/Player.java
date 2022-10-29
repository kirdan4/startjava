package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player implements Comparable<Player> {
	private final String name;
	private int countAttempts;
	private int countWins;
	private final int[] enteredNumbers = new int[10];

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getCountAttempts() {
		return countAttempts;
	}

	public int getCountWins() {
		return countWins;
	}

	public void setCountAttempts(int countAttempts) {
		this.countAttempts = countAttempts;
	}

	public void setCountWins(int countWins) {
		this.countWins = countWins;
	}

	public int getLastNumber() {
		return enteredNumbers[countAttempts - 1];
	}

	public void addNumber(int number) {
		if (number > 100 || number < 1) {
			countAttempts++;
			throw new IllegalArgumentException("Ведено некорректное число. Числа должны быть от 1 до 100.");
		}
		enteredNumbers[countAttempts] = number;
		countAttempts++;
	}

	public int[] getEnteredNumbers() {
		return Arrays.copyOf(enteredNumbers, countAttempts);
	}

	public void incCountWins() {
		countWins++;
	}

	public void resetNumbers() {
		Arrays.fill(enteredNumbers, 0, countAttempts, 0);
	}

	@Override
	public int compareTo(Player anotherPlayer) {
		return anotherPlayer.countWins - this.countWins;
	}
}
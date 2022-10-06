package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
	private final String name;
	private int countAttempts;
	private Integer countWins = 0;
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

	public Integer getCountWins() {
		return countWins;
	}

	public void setCountAttempts(int countAttempts) {
		this.countAttempts = countAttempts;
	}

	public void setCountWins(Integer countWins) {
		this.countWins = countWins;
	}

	public int getLastNumber() {
		return enteredNumbers[countAttempts];
	}

	public void addNumber(int number) {
		if (number > 100 || number < 1) {
			incCountAttempts();
			throw new IllegalArgumentException("Введено некорректное число. Числа должны быть от 1 до 100.");
		}
		enteredNumbers[countAttempts] = number;
	}

	public int[] getEnteredNumbers() {
		return Arrays.copyOf(enteredNumbers, countAttempts);
	}

	public void incCountAttempts() {
		countAttempts++;
	}

	public void incCountWins() {
		countWins++;
	}

	public void resetNumbers() {
		Arrays.fill(enteredNumbers, 0, countAttempts, 0);
	}
}
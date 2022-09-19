package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
	private final String name;
	private int countAttempts;
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

	public void setCountAttempts(int countAttempts) {
		this.countAttempts = countAttempts;
	}

	public int getLastNumber() {
		return enteredNumbers[countAttempts - 1];
	}

	public void addNumber(int number) {
		enteredNumbers[countAttempts] = number;
		countAttempts++;
	}

	public int[] getEnteredNumbers() {
		return Arrays.copyOf(enteredNumbers, countAttempts);
	}

	public void resetNumbers() {
		Arrays.fill(enteredNumbers, 0, countAttempts, 0);
	}
}
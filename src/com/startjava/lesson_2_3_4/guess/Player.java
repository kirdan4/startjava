package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
	private final String name;
	protected int attemptsPlayer = 0;
	private final int[] storageNumbersPlayer = new int[10];

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getAttemptsPlayer() {
		return attemptsPlayer;
	}

	public void setAttemptsPlayer(int attemptsPlayer) {
		this.attemptsPlayer = attemptsPlayer;
	}

	public int getValueFromStorage() {
		return storageNumbersPlayer[attemptsPlayer];
	}

	public void setPlayerNumberToStorage(int number) {
		storageNumbersPlayer[attemptsPlayer] = number;
	}

	public int[] getNumbersNamedPlayer() {
		return Arrays.copyOf(storageNumbersPlayer, attemptsPlayer);
	}

	public void incAttemptsPlayer() {
		attemptsPlayer++;
	}

	public void zeroingStorageNumbersPlayer() {
		Arrays.fill(storageNumbersPlayer, 0, attemptsPlayer, 0);
	}
}
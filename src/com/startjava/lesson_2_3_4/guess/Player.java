package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
	private final String name;
	protected int countPlayer = 0;
	private final int[] intArray = new int[10];

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getCountPlayer() {
		return countPlayer;
	}

	public void setCountPlayer(int countPlayer) {
		this.countPlayer = countPlayer;
	}

	public int getIndexArray(int index) {
		return intArray[index];
	}

	public void setIndexArray(int index, int number) {
		intArray[index] = number;
	}

	public int[] getAllArray() {
		int[] copyIntArray = new int[countPlayer];
		System.arraycopy(intArray, 0, copyIntArray, 0, countPlayer);
		return copyIntArray;
	}

	public void incCountPlayer() {
		countPlayer += 1;
	}

	public void printArray(int[] nums) {
		for(int num : nums) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	public void zeroingArray() {
		Arrays.fill(intArray, 0, countPlayer, 0);
	}

	public boolean checkAttempts() {
		if (countPlayer > 9) {
			System.out.printf("У игрока %s закончились попытки.\n", name);
			return false;
		}
		return true;
	}
}
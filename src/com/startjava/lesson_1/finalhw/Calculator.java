package com.startjava.lesson_1.finalhw;

public class Calculator {
	public static void main(String[] args) {
		//Калькулятор
		int num1 = 2;
		int num2 = 10;
		double result = 1;
		char sign = '^';
		if (sign == '+') {
			result = num1 + num2;
		} else if (sign == '-') {
			result = num1 - num2;
		} else if (sign == '*') {
			result = num1 * num2;
		} else if (sign == '/') {
			result  = (double) num1 / (double) num2;
		} else if (sign == '^') {
			for (int i = 1; i <= num2; i++) {
				result *= num1;
			}
		} else if (sign == '%') {
			result = num1 % num2;
		}
		System.out.println(num1 + " " + sign + " " + num2 + " = "  + result);
	}
}
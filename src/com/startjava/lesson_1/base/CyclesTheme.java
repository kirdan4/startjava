package com.startjava.lesson_1.base;

public class CyclesTheme {
	public static void main(String[] args) {
		//Подсчет суммы четных и нечетных чисел
		System.out.println("1. Подсчет суммы четных и нечетных чисел");
		int sumEven = 0;
		int sumOdd = 0;
		int counter = -10;
		do {
			if (counter % 2 == 0) {
				sumEven += counter;
			} else {
				sumOdd += counter;
			}
			counter++;
		} while (counter <= 21);
		System.out.printf("В промежутке [-10, 21] сумма четных чисел = %d, а нечетных = %d%n", sumEven, sumOdd);

		//Вывод чисел между max и min
		System.out.println("\n2. Вывод чисел между max и min");
		int num1 = 10;
		int num2 = 5;
		int num3 = -1;
		int minNum = 0;
		int maxNum = 0;
		if (num1 < num2) {
			minNum = num1;
		} else {
			minNum = num2;
		}
		if (minNum > num3){
			minNum = num3;
		}
		if (num1 > num2) {
			maxNum = num1;
		} else {
			maxNum = num2;
		}
		if (maxNum < num3){
			maxNum = num3;
		}
		for (int i = maxNum - 1; i > minNum; i--) {
			System.out.println(i);
		}

		//Вывод реверсивного числа и суммы его цифр
		System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
		int srcNum = 1234;
		int reverseNum = 0;
		int sumDigits = 0;
		// number flip
		while (srcNum != 0) {
			sumDigits += srcNum % 10;
			reverseNum += srcNum % 10;
			srcNum /= 10;
			if (srcNum != 0) {
				reverseNum *= 10;
			}
		}
		System.out.println(reverseNum);
		System.out.println(sumDigits);

		//Вывод чисел на консоль в несколько строк
		System.out.println("\n4. Вывод чисел на консоль в несколько строк");
		int limit = 29;
		int perLine = 10;
		for (int i = 1; i <= limit; i += perLine) {
			for (int j = i; j < i + perLine && j <= limit; j += 2) {
				if (j > 24 && j <= limit) {
					System.out.printf("%3d", 0);
				} else {
					System.out.printf("%3d", j);
				}
			}
			System.out.println();
		}

		//Проверка количества единиц на четность
		System.out.println("\n5. Проверка количества единиц на четность");
		srcNum = 3141591;
		int numOne = 0;
		while (srcNum != 0) {
			if (srcNum % 10 == 1) {
				numOne++;
			}
			srcNum /= 10;
		}
		String answerEven = (numOne % 2 == 0) ? "Число содержит четное (" + numOne + 
				") количество единиц." : "Число содержит нечетное (" + numOne + 
				") количество единиц.";
		System.out.println(answerEven);

		//Отображение фигур в консоли
		System.out.println("\n6. Отображение фигур в консоли");
		//Rectangle
		for (int i = 0; i < 5; i++){
			for (int j = 0; j < 10; j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		//Triangle 1
		int a = 0;
		int b = 0;
		while (a < 5) {
			while (b < 5) {
				System.out.print("#");
				b++;
			}
			System.out.println();
			a++;
			b = a;
		}
		// Triangle 2
		int rows = 3;
		int c;
		int d = 0;
		// top half of triangle
		do {
			c = 0 ;
			do {
				System.out.print("$");
			}
			while (++c <= d);
			System.out.println();
		}
		while (++d < rows);
		//lower half of triangle
		d = rows - 1;
		do {
			c = 0;
			do {
				System.out.print("$");
			}
			while (++c <= d - 1);
			System.out.println();
		}
		while (--d > 0);

		//Отображение ASCII-символов
		System.out.println("\n7. Отображение ASCII-символов");
		System.out.print(" № символ \n");
		for (int i = 33; i <= 47; i += 2) {
			System.out.printf("%03d %4s%n", i, (char) i);
		}
		for (int i = 98; i <= 122; i += 2) {
			System.out.printf("%03d %4s%n", i, (char) i);
		}

		// Проверка, является ли число палиндромом
		System.out.println("\n8. Проверка, является ли число палиндромом");
		srcNum = 1234321;
		int reverseSrcNum = 0;
		int temp = srcNum;
		// number flip
		while (srcNum != 0) {
			reverseSrcNum += srcNum % 10;
			srcNum /= 10;
			if (srcNum != 0) {
				reverseSrcNum *= 10;
			}
		}
		// palindrome define
		String answerPalind = (temp == reverseSrcNum) ? "Число " + temp + " палиндром!":
				"Число " + temp + " не палиндром :(";
		System.out.println(answerPalind);

		//Определение, является ли число счастливым
		System.out.println("\n9. Определение, является ли число счастливым");
		srcNum = 142106;
		int topThreeDigits = srcNum / 1000;
		int lowerThreeDigits = srcNum % 1000;
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 1; i <= 100; i *= 10) {
			sum1 += topThreeDigits / i % 10;
			sum2 += lowerThreeDigits / i % 10;
		}
		String answerHappy = (sum1 == sum2) ? "Число счастливое" : "Число не счастливое";
		System.out.println(topThreeDigits + " = " + sum1);
		System.out.println(lowerThreeDigits + " = " + sum2);
		System.out.println(answerHappy);

		// Вывод таблицы умножения Пифагора
		System.out.println("\n10. Вывод таблицы умножения Пифагора");
		System.out.printf("   |");
		for (int i = 2; i< 10; i++) {
			System.out.printf("%2d ", i);
		}
		System.out.printf("\n---|-----------------------\n");
		for (int i = 2; i < 10; i++) {
			System.out.printf("%2d |", i);
			for(int j = 2; j < 10; j++) {
				System.out.printf("%2d ", i * j);
			}
			System.out.println("");
		}
	}
}


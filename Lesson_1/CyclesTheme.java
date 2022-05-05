public class CyclesTheme {
	public static void main(String[] args) {
		//Подсчет суммы четных и нечетных чисел
		System.out.println("1. Подсчет суммы четных и нечетных чисел");
		int sumEven = 0;
		int sumOdd = 0;
		int initialVar = -10;
		do {
			if (initialVar % 2 == 0) {
				sumEven += initialVar;
			} else {
				sumOdd += initialVar;
			}
			initialVar++;
		} while (initialVar <= 21);
		System.out.println("Сумма четных чисел = " + sumEven);
		System.out.println("Сумма нечетных чисел = " + sumOdd);

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
		for (int i = maxNum; i >= minNum; i--) {
			System.out.println(i);
		}

		//Вывод реверсивного числа и суммы его цифр
		System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
		int srcNum = 1234;
		int result = 0;
		int sum = 0;
		// number flip
		while (srcNum != 0) {
			result += srcNum % 10;
			srcNum /= 10;
			if (srcNum != 0) {
				result *= 10;
			}
		}
		System.out.println(result);
		// sum digits of number
		while (result != 0) {
			sum = sum + result % 10;
			result = result / 10;
		}
		System.out.println(sum);

		//Вывод чисел на консоль в несколько строк
		System.out.println("\n4. Вывод чисел на консоль в несколько строк");
		int limit = 29;
		int perLine = 10;
		for (int i = 1; i <= limit; i += perLine) {
			for (int j = i; j < i + perLine && j <= limit; j = j + 2) {
				if (j > 21 && j <= limit) {
					System.out.printf("%3d", 0);
				} else {
					System.out.printf("%3d", j);
				}
			}
		System.out.println();
		}

		//Проверка количества единиц на четность
		System.out.println("\n5. Проверка количества единиц на четность");
		int num = 3141591;
		int numOne = 0;
		String answer = "non";
		while (num != 0) {
			if (num % 10 == 1) {
				numOne += 1;
				num /= 10;
			} else {
				num /= 10;
			}
			if (numOne % 2 == 0) {
				answer = "Четное";
			} else {
				answer = "Нечетное";
			}
		}
		System.out.println(numOne + " - " + answer);

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
		int j;
		int i = 0;
		// top half of triangle
		do {
			j = 0 ;
			do {
				System.out.print("$");
			}
			while (++j <= i);
			System.out.println();
		}
		while (++i < rows);
		//lower half of triangle
		i = rows - 1;
		do {
			j = 0;
			do {
				System.out.print("$");
			}
			while (++j <= i - 1);
			System.out.println();
		}
		while (--i > 0);

		//Отображение ASCII-символов
		System.out.println("\n7. Отображение ASCII-символов");
		System.out.print("\n № символ \n");
		for (int k = 33; k <= 47; k = k + 2) {
			char ch = (char) k;
			System.out.printf("%03d %4s%n", k, ch);
		}
		for (int k = 98; k <= 122; k = k + 2) {
			char ch = (char) k;
			System.out.printf("%03d %4s%n", k, ch);
		}

		// Проверка, является ли число палиндромом
		System.out.println("\n8. Проверка, является ли число палиндромом");
		int srcNumber = 1234321;
		int overturn = 0;
		int temp;
		temp = srcNumber;
		// number flip
		while (srcNumber != 0) {
			overturn += srcNumber % 10;
			srcNumber /= 10;
			if (srcNumber != 0) {
				overturn *= 10;
			}
		}
		// palinrome define
		String answerPalind = (temp == overturn) ? "Число " + temp + " палиндром!": "Число " + temp + " не палиндром :(";
		System.out.println(answerPalind);

		//Определение, является ли число счастливым
		System.out.println("\n9. Определение, является ли число счастливым");
		int number = 123321;
		int topThreeDigit;
		int lowerThreeDigit;
		topThreeDigit = number % 1000;
		lowerThreeDigit = number / 1000;
		int sum1 = 0;
		for (int f = 0; f < 3; f++) {
			sum1 += (topThreeDigit / Math.pow(10, f)) % 10;
		}
		int sum2 = 0;
		for (int f = 0; f < 3; f++) {
			sum2 += (lowerThreeDigit / Math.pow(10, f)) % 10;
		}
		String answerHappy = (sum1 == sum2) ? "Число счастливое" : "Число не счастливое";
		System.out.println(topThreeDigit + " = " + sum1);
		System.out.println(lowerThreeDigit + " = " + sum2);
		System.out.println(answerHappy);

		// Вывод таблицы умножения Пифагора
		System.out.println("\n10. Вывод таблицы умножения Пифагора");
		int x;
		int y;
		System.out.printf("   |");
		for (x = 2; x< 10; x++) {
			System.out.printf("%2d ", x);
		}
		System.out.printf("\n---|-----------------------\n");
		for (x = 2; x < 10; x++) {
			System.out.printf("%2d |", x);
			for(y = 2; y < 10; y++) {
				System.out.printf("%2d ", x * y);
			}
			System.out.println("");
		}
	}
}


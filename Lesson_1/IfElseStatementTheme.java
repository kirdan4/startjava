public class IfElseStatementTheme {
	public static void main(String[] args) {
		//Перевод псевдокода на язык Java
		System.out.println("1. Перевод псевдокода на язык Java");
		int age = 32;
		if (age > 20) {
			System.out.println("Тебе больше 20!");
		} else {
			System.out.println("Тебе меньше 20!");
		}
		String sex = "women";
		if (sex != "man") {
			System.out.println("Ты не мужик!");
		}
		float height = 1.7f;
		if (height < 1.8f) {
			System.out.println("Ты коротышка!");
		} else {
			System.out.println("Ты колонча!");
		}
		String name =  "Alex";
		char symbol1Name = name.charAt(0);
		if (symbol1Name == 'M') {
			System.out.println("Это хорошо!");
		} else if (symbol1Name == 'I') {
			System.out.println("Это очень хорошо!");
		} else {
			System.out.println("Проходи!");
		}

		//Поиск максимального и минимального числа
		System.out.println("\n2. Поиск максимального и минимального числа");
		int num1 = 12;
		int num2 = 7;
		String answerMax = (num1 > num2) ? "Максимальное число = " + num1 : "Максимальное число = " + num2;
		System.out.println(answerMax);
		String answerMin = (num1 < num2) ? "Минимальное число = " + num1 : "Минимальное число = " + num2;
		System.out.println(answerMin);

		//Работа с числом
		System.out.println("\n3. Работа с числом");
		int num = 15;
		if (num % 2 == 0) {
			System.out.printf("Число %d четное %n", num);
		} else {
			System.out.printf("Число %d нечетное %n", num);
		}
		if (num < 0) {
			System.out.printf("Число %d отрицательное %n", num);
		} else {
			System.out.printf("Число %d положительное %n", num);
		}
		if (num == 0) {
			System.out.println("Число ноль");
		}

		//Поиск общей цифры в числах
		System.out.println("\n4. Поиск общей цифры в числах");
		int srcNum1 = 561;
		int srcNum2 = 871;
		if (srcNum1 / 100 == srcNum2 / 100) {
			System.out.println("Одинаковая цифра в сотнях = " + srcNum1 / 100);
		}
		if (srcNum1 % 100 / 10 == srcNum2 % 100 / 10) {
			System.out.println("Одинаковая цифра в десятках = " + srcNum1 % 100 / 10);
		}
		if (srcNum1 % 10 == srcNum2 % 10) {
			System.out.println("Одинаковая цифра в единицах = " + srcNum1 % 10);
		}

		//Определение буквы, числа или символа по их коду
		System.out.println("\n5. Определение буквы, числа или символа по их коду");
		char sumbolZ = '\u005A';
		if (sumbolZ > 64 && sumbolZ < 91) {
			System.out.println(sumbolZ + " - заглавная буква");
		} else if (sumbolZ > 96 && sumbolZ < 123) {
			System.out.println(sumbolZ + " - строчная буква");
		} else if (sumbolZ > 47 && sumbolZ < 58) {
			System.out.println(sumbolZ + " - число");
		} else {
			System.out.println(sumbolZ + " - символ");
		}

		//Определение суммы вклада и начисленных банком %
		System.out.println("\n6. Определение суммы вклада и начисленных банком %");
		float depositAmount = 300000;
		float accruedInterest = 0;
		if (depositAmount < 100000) {
			accruedInterest = depositAmount * 0.05f;
		} else if (depositAmount > 100000 && depositAmount <= 300000) {
			accruedInterest = depositAmount * 0.07f;
		} else if (depositAmount > 300000) {
			accruedInterest = depositAmount * 0.1f;
		}
		System.out.println("Сумму вклада = " + depositAmount);
		System.out.println("Начисленный % = " + accruedInterest);
		System.out.println("Итоговая сумма = " + (depositAmount + accruedInterest));

		//Определение оценки по предметам
		System.out.println("\n7. Определение оценки по предметам");
		int historyPercent = 59;
		int compSciencePercent = 91;
		int historyScore = 0;
		int compScienceScore = 0;
		if (historyPercent > 91) {
			historyScore = 5;
		} else if (historyPercent > 73) {
			historyScore = 4;
		} else if (historyPercent > 60) {
			historyScore = 3;
		} else if (historyPercent <= 60) {
			historyScore = 2;
		}
		 if (compSciencePercent > 91) {
			compScienceScore = 5;
		} else if (compSciencePercent > 73) {
			compScienceScore = 4;
		} else if (compSciencePercent > 60) {
			compScienceScore = 3;
		} else if (compSciencePercent <= 60) {
			compScienceScore = 2;
		}
		System.out.println(historyScore + " - История");
		System.out.println(compScienceScore + " - Информатика");
		System.out.println((historyScore + compScienceScore) / 2 + " - Средний бал");
		System.out.println((historyPercent + compSciencePercent) / 2 + " - Средний % по предметам");

		//Расчет прибыли (убытка)
		System.out.println("\n8. Расчет прибыли (убытка)");
		int costPrice = 9000;
		int rent = 5000;
		int revenue = 15000;
		int profitYear = (revenue - costPrice - rent) * 12;
		if (profitYear > 0) {
			System.out.println("Прибыль(+)/Убыток(-) за год = +" + profitYear);
		} else if (profitYear < 0) {
			System.out.println("Прибыль(+)/Убыток(-) за год = " + profitYear);
		}

		//Определение существования треугольника
		System.out.println("\n9. Определение существования треугольника");
		double side1 = 4;
		double side2 = 5;
		double side3 = 3;
		if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
			System.out.println("Треугольник существует.");
			if (side3 == Math.sqrt(side1 * side1 + side2 * side2)) {
				System.out.println("Сторона 3 - гипотенуза \nСторона 1 и Сторона 2 - катеты");
			}
			if (side1 == Math.sqrt(side2 * side2 + side3 * side3)) {
				System.out.println("Сторона 1 - гипотенуза \nСторона 2 и Сторона 3 - катеты");
			}
			if (side2 == Math.sqrt(side1 * side1 + side3 * side3)) {
				System.out.println("Сторона 2 - гипотенуза \nСторона 1 и Сторона 3 - катеты");
			}
			double halfP = (side1 + side2 + side3) / 2;
			double area = Math.sqrt(halfP * (halfP - side1) * (halfP - side2) * (halfP - side3));
			System.out.println("Площадь = " + area);
/*
|\    
| \   
|  \  
|___\ 
*/
			char pipe = 124;
			char bsl = 92;
			char uLine = 95;
			char space = 32;
			System.out.println("" + pipe + bsl);
			System.out.println("" + pipe + space + bsl);
			System.out.println("" + pipe + space + space + bsl);
			System.out.println("" + pipe + uLine + uLine + uLine + bsl);
		} else {
			System.out.println("Треугольник не существует.");
		}

		//Подсчет количества банкнот
		System.out.println("\n10. Подсчет количества банкнот");
		int sum = 567;
		int bank50 = 0;
		int bank10 = 0;
		int bank1 = 0;
		bank50 = sum / 50;
		bank10 = (sum % 50) / 10;
		bank1 = (sum % 50) % 10;
		System.out.println("Номиналы банкнот = 50, 10, 1");
		System.out.println("Сумма = " + ((bank50 * 50) + (bank10 * 10) + (bank1 *1)));
		System.out.println("Необходимо банкнот = " + (bank50 + bank10 + bank1));
		System.out.printf("Номиналом 50 - %d шт.%nНоминалом 10 - %d шт. %nНоминалом 1 - %d шт.%n", bank50, bank10, bank1);
	}
}
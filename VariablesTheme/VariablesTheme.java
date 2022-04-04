public class VariablesTheme {
	public static void main(String[] args) {
		//Создание переменных и вывод их значений
		System.out.println("1. Создание переменных и вывод их значений");
		char markPc = '';
		boolean isTrue = true;
		byte ram = 8;
		short hdd = 128;
		int vRam = 1536;
		long cpu = 2700;
		float diagonal = 13.3f;
		double weight = 1.58d;
		System.out.println("marc PC = " + markPc);
		System.out.println(isTrue);
		System.out.println("RAM = " + ram);
		System.out.println("HDD = " + hdd);
		System.out.println("VRAM = " + vRam);
		System.out.println("CPU = " + cpu);
		System.out.println("Diagonal = " + diagonal);
		System.out.println("Weight = " + weight);
		System.out.print("\n");

		//Расчет стоимости товара со скидкой
		System.out.println("2. Расчет стоимости товара со скидкой");
		int priseProduct1 = 100;
		int priseProduct2 = 200;
		int amontDiscount = (priseProduct1 + priseProduct2) * 11 / 100;
		int totalPriceOfDiscouted = (priseProduct1 + priseProduct2) - amontDiscount;
		System.out.println ("Сумма скидки = "+ amontDiscount + " rub.");
		System.out.println ("Общая стоимость товаров со скидкой = "+ totalPriceOfDiscouted+ " rub.");
		System.out.print("\n");

		//Вывод на консоль слова JAVA
		System.out.println("3. Вывод на консоль слова JAVA");
		System.out.println("   J    a   v     v  a ");
		System.out.println("   J   a a   v   v  a a");
		System.out.println("J  J  aaaaa   V V  aaaaa");
		System.out.println(" JJ  a     a   V  a     a");
		System.out.print("\n");

		//Отображение min и max значений числовых типов данных
		System.out.println("4. Отображение min и max значений числовых типов данных");
		byte byteMaxValue = 127;
		short shortMaxValue = 32767;
		int intMaxValue = 2147483647;
		long longMaxValue = 9223372036854775807L;
		System.out.println("Мах byte = " + byteMaxValue);
		System.out.println("Мах short = " + shortMaxValue);
		System.out.println("Мах int = " + intMaxValue);
		System.out.println("Мах long = " + longMaxValue);
		System.out.print("\n");
		//Инкрементация, декрементация значений числовых типов данных
		System.out.println(++byteMaxValue);
		System.out.println(--byteMaxValue );
		System.out.println(++shortMaxValue);
		System.out.println(--shortMaxValue);
		System.out.println(++intMaxValue);
		System.out.println(--intMaxValue);
		System.out.println(++longMaxValue);
		System.out.println(--longMaxValue);
		System.out.print("\n");

		//Перестановка местами значений переменных (с дополнительной переменной) 
		System.out.println("5. Перестановка местами значений переменных (с вводом дополнительной переменной");
		float floatValue1 = 2.1f;
		float floatValue2 = 3.6f;
		float addVariable;
		System.out.println("var1 = " + floatValue1);
		System.out.println("var2 = " + floatValue2);
		addVariable = floatValue1;
		floatValue1 = floatValue2;
		floatValue2 = addVariable;
		System.out.println("var1 = " + floatValue1);
		System.out.println("var2 = " + floatValue2);
		System.out.print("\n");

		//Вывод символов и их кодов
		System.out.println("6. Вывод символов и их кодов");
		int symbol35 = 35;
		int symbol38 = 38;
		int symbol64 = 64;
		int symbol94 = 94;
		int symbol95 = 95;
		System.out.println(symbol35 + " " + (char) symbol35);
		System.out.println(symbol38 + " " + (char) symbol38);
		System.out.println(symbol64 + " " + (char) symbol64);
		System.out.println(symbol94 + " " + (char) symbol94);
		System.out.println(symbol95 + " " + (char) symbol95);
		System.out.print("\n");

		//Произведение и сумма цифр числа (без цикла)
		System.out.println("7. Произведение и сумма цифр числа 345 (без цикла)");
		int threeDigitNumber = 345;
		int firstDigit = threeDigitNumber / 100;
		int secondDigit = threeDigitNumber / 10 % 10;
		int thirdDigit = threeDigitNumber % 10;
		System.out.println(firstDigit + secondDigit + thirdDigit);
		System.out.println(firstDigit * secondDigit * thirdDigit);
		System.out.print("\n");

		//Вывод на консоль ASCII-арт Дюка
		/*
    /\    
   /  \   
  /_( )\  
 /      \ 
/____/\__\
*/
		System.out.println("8. Вывод на консоль ASCII-арт Дюка");
		char sp = ' ';
		char sl = 47;
		char bsl = 92;
		char uLine = 95;
		char brac1 = '(';
		char brac2 = ')';
		System.out.println("" + sp + sp + sp + sp + sl + bsl + sp + sp + sp + sp);
		System.out.println("" + sp + sp + sp + sl + sp + sp + bsl + sp + sp + sp);
		System.out.println("" + sp + sp + sl + uLine + brac1 + sp + brac2 + bsl + sp + sp);
		System.out.println("" + sp + sl + sp + sp + sp + sp + sp + sp + bsl + sp);
		System.out.println("" + sl + uLine + uLine + uLine + uLine + sl + bsl + uLine + uLine + bsl);
		System.out.print("\n");

		//Отображение количества сотен, десятков и единиц числа
		System.out.println("9. Отображение количества сотен, десятков и единиц числа 123");
		int srcNum = 123;
		int hundreds = srcNum / 100;
		int dozens = srcNum % 100 / 10;
		int units = srcNum % 10;
		System.out.println("Кол-во сотен = " + hundreds);
		System.out.println("Кол-во десятков = " + dozens);
		System.out.println("Кол-во единиц = " + units);
		System.out.print("\n");

		//Преобразование секунд
		System.out.println("10. Преобразование секунд в часы, минуты, секунды");
		int time = 86399;
		int hour = time / 60 / 60;
		int min = time / 60 % 60;
		int sec = time % 60;
				System.out.println(hour + ":" + min + ":" + sec);
	}
}
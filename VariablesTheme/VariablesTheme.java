public class VariablesTheme {
	public static void main(String[] args) {

		// Создание переменных и вывод их значений
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

		// Расчет стоимости товара со скидкой
		System.out.println("2. Расчет стоимости товара со скидкой");
		int priseProduct1 = 100;
		int priseProduct2 = 200;
		int amontDiscount = (priseProduct1 + priseProduct2) * 11 / 100;
		int totalPriceOfDiscouted = (priseProduct1 + priseProduct2) - (priseProduct1 + priseProduct2) * 11 / 100;
		System.out.println ("Сумма скидки = "+ amontDiscount + " rub.");
		System.out.println ("Общая стоимость товаров со скидкой = "+ totalPriceOfDiscouted+ " rub.");
		System.out.print("\n");

		// Вывод на консоль слова JAVA
		System.out.println("3. Вывод на консоль слова JAVA");
		System.out.println("   J    a   v     v  a ");
		System.out.println("   J   a a   v   v  a a");
		System.out.println("J  J  aaaaa   V V  aaaaa");
		System.out.println(" JJ  a     a   V  a     a");
		System.out.print("\n");

		// Отображение min и max значений числовых типов данных
		System.out.println("4. Отображение min и max значений числовых типов данных");
		byte maxValue_byte = 127;
		short maxValue_short  = 32767;
		int maxValue_int = 2147483647;
		long maxValue_long = 9223372036854775807L;
		float maxValue_float = 3.4e+038f;
		double maxValue_double = 1.7976931348623157E+308;
		System.out.println("Мах byte = " + maxValue_byte);
		System.out.println("Мах short = " + maxValue_short);
		System.out.println("Мах int = " + maxValue_int);
		System.out.println("Мах long = " + maxValue_long);
		System.out.print("\n");
		// Инкрементация, декрементация значений числовых типов данных
		System.out.println(++maxValue_byte);
		System.out.println(--maxValue_byte);
		System.out.println(++maxValue_short);
		System.out.println(--maxValue_short);
		System.out.println(++maxValue_int);
		System.out.println(--maxValue_int);
		System.out.println(++maxValue_long);
		System.out.println(--maxValue_long);
		System.out.print("\n");

		// Перестановка местами значений переменных (с дополнительной переменной) 
		System.out.println("5. Перестановка местами значений переменных (с вводом дополнительной переменной");
		float var1 = 2.1f;
		float var2 = 3.6f;
		float var3;
		System.out.println("var1 = " + var1);
		System.out.println("var2 = " + var2);
		var3 = var1;
		var1 = var2;
		var2 = var3;
		System.out.println("var1 = " + var1);
		System.out.println("var2 = " + var2);
		System.out.print("\n");

		//Вывод символов и их кодов
		System.out.println("6. Вывод символов и их кодов");
		int variable1 = 35;
		int variable2 = 38;
		int variable3 = 64;
		int variable4 = 94;
		int variable5 = 95;
		System.out.println(variable1 + " " + (char) variable1);
		System.out.println(variable2 + " " + (char) variable2);
		System.out.println(variable3 + " " + (char) variable3);
		System.out.println(variable4 + " " + (char) variable4);
		System.out.println(variable5 + " " + (char) variable5);
		System.out.print("\n");

		//Произведение и сумма цифр числа (без цикла)
		System.out.println("7. Произведение и сумма цифр числа 345 (без цикла)");
		int num1 = 3;
		int num2 = 4;
		int num3 = 5;
		System.out.println(num1+num2+num3);
		System.out.println(num1*num2*num3);
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
		int a = 123;
		int x1 = a/100;
		int x2 = a%100/10;
		int x3 = a%10;
		System.out.println("Кол-во сотен = " + x1);
		System.out.println("Кол-во десятков = " + x2);
		System.out.println("Кол-во единиц = " + x3);
		System.out.print("\n");

		// Преобразование секунд
		System.out.println("10. Преобразование секунд в часы, минуты, секунды");
		int time = 86399;
		int sec = time%60;
		int hour = time/60;
		int min = hour%60;
		hour = hour / 60;
		System.out.println(hour + ":" + min + ":" + sec);
	}
}
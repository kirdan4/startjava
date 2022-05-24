import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calculatorOne = new Calculator();
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Введите первое число:");
			calculatorOne.setNumber1(scan.nextInt());
			System.out.println("Ведите знак математической операции (+, -, *, /, ^, %)");
			calculatorOne.setOperation(scan.next().charAt(0));
			System.out.println("Введите второе число:");
			calculatorOne.setNumber2(scan.nextInt());
			calculatorOne.setResult(calculatorOne.calc(calculatorOne.getNumber1(),calculatorOne.getNumber2(),calculatorOne.getOperation()));
			System.out.println("Результат операции: " + calculatorOne.getResult());
			do {
				System.out.println("Хотите продолжить вычисления? [yes/no]");
				calculatorOne.setReply(scan.next());
			} while (!calculatorOne.getReply().equals("yes") && !calculatorOne.getReply().equals("no"));
		} while (calculatorOne.getReply().equals("yes"));
	}
}
import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Введите первое число:");
			calculator.setNumber1(scan.nextInt());
			System.out.println("Ведите знак математической операции (+, -, *, /, ^, %)");
			calculator.setOperation(scan.next().charAt(0));
			System.out.println("Введите второе число:");
			calculator.setNumber2(scan.nextInt());
			System.out.println("Результат операции: " + calculator.calc());
			do {
				System.out.println("Хотите продолжить вычисления? [yes/no]");
				calculator.setReply(scan.next());
			} while (!calculator.getReply().equals("yes") && !calculator.getReply().equals("no"));
		} while (calculator.getReply().equals("yes"));
	}
}
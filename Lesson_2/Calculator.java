public class Calculator {
	private int number1;
	private int number2;
	private char operation;

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	public void setOperation(char operation) {
		this.operation = operation;
	}

	public int calc() {
		switch (operation) {
			case '+':
				return number1 + number2;
			case '-':
				return number1 - number2;
			case '*':
				return number1 * number2;
			case '/':
				return number1 / number2;
			case '^':
				int result = 1;
				for (int i = 1; i <= number2; i++) {
					result *= number1;
				}
				return result;
			case '%':
				return number1 % number2;
			default:
				System.out.println("Введён неправильный символ");
		}
		return 0;
	}
}
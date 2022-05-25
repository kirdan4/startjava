public class Calculator {
	private int number1;
	private int number2;
	private char operation;
	private int result;
	private String reply;

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	public void setOperation(char operation) {
		this.operation = operation;
	}

	public String getReply() {
		return reply;
	}

	public void setReply(String reply) {
		this.reply = reply;
	}

	public int calc() {
		switch (operation) {
			case '+':
				result = number1 + number2;
				break;
			case '-':
				result = number1 - number2;
				break;
			case '*':
				result = number1 * number2;
				break;
			case '/':
				result = number1 / number2;
				break;
			case '^':
					result = 1;
				for (int i = 1; i <= number2; i++) {
					result *= number1;
				}
				break;
			case '%':
				result = number1 % number2;
				break;
			default:
				System.out.println("Введён неправильный символ");
		}
		return result;
	}
}
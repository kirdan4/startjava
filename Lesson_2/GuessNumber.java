import java.util.Scanner;

public class GuessNumber {
	private int hiddenNumber;
	private Player player1;
	private Player player2;

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void start() {
		Scanner scan = new Scanner(System.in);
		hiddenNumber = (int) (Math.random() * 100) + 1;
		while (true) {
			System.out.printf("Ходит %s. Введи число от 1 до 100:\n", player1.getName());
			player1.setNumber(scan.nextInt());
			if (player1.getNumber() > hiddenNumber) {
				System.out.printf("Твоё число %d. Загаданное число меньше.\n", player1.getNumber());
			} else if (player1.getNumber() < hiddenNumber) {
				System.out.printf("Твоё число %d. Загаданное число больше.\n", player1.getNumber());
			} else {
				System.out.printf("Твоё число %d. Победил %s!\n", player1.getNumber(), player1.getName());
				break;
			}
			System.out.printf("Ходит %s. Введи число от 1 до 100: \n", player2.getName());
			player2.setNumber(scan.nextInt());
			if (player2.getNumber() > hiddenNumber) {
				System.out.printf("Твоё число %d. Загаданное число меньше.\n", player2.getNumber());
			} else if (player2.getNumber() < hiddenNumber) {
				System.out.printf("Твоё число %d. Загаданное число больше.\n", player2.getNumber());
			} else {
				System.out.printf("Твоё число %d. Победил %s!\n", player2.getNumber(), player2.getName());
				break;
			}
		}
	}
}
import java.util.Scanner;

public class GuessNumber {
	Scanner scan = new Scanner(System.in);
	private int hiddenNumber;
	private Player player1;
	private Player player2;

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void gameBody() {
		hiddenNumber = (int) (Math.random() * 99) + 1;
		while (true) {
			System.out.printf("Ходит %s. Введи число от 1 до 100:\n", player1.getName());
			player1.setPlayerNumber(scan.nextInt());
			if (player1.getPlayerNumber() > hiddenNumber) {
				System.out.printf("Твоё число %d. Загаданное число меньше.\n", player1.getPlayerNumber());
			} else if (player1.getPlayerNumber() < hiddenNumber) {
				System.out.printf("Твоё число %d. Загаданное число больше.\n", player1.getPlayerNumber());
			} else if (player1.getPlayerNumber() == hiddenNumber) {
				System.out.printf("Твоё число %d. Победил %s!\n", player1.getPlayerNumber(), player1.getName());
			break;
			}
			System.out.printf("Ходит %s. Введи число от 1 до 100: \n", player2.getName());
			player2.setPlayerNumber(scan.nextInt());
			if (player2.getPlayerNumber() > hiddenNumber) {
				System.out.printf("Твоё число %d. Загаданное число меньше.\n", player2.getPlayerNumber());
			} else if (player2.getPlayerNumber() < hiddenNumber) {
				System.out.printf("Твоё число %d. Загаданное число больше.\n", player2.getPlayerNumber());
			} else if (player2.getPlayerNumber() == hiddenNumber) {
				System.out.printf("Твоё число %d. Победил %s!\n", player2.getPlayerNumber(), player2.getName());
			break;
			}
		}
	}
}
import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		String reply;
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите имя игрока 1:");
		Player player1 = new Player(scan.nextLine());
		System.out.println("Введите имя игрока 2:");
		Player player2 = new Player(scan.nextLine());
		GuessNumber game = new GuessNumber(player1, player2);
		do {
			game.gameBody();
			do {
				System.out.println("Хотите продолжить игру? [yes/no]");
				reply = scan.next();
			} while (!reply.equals("yes") && !reply.equals("no"));
		} while (reply.equals("yes"));
	}
}
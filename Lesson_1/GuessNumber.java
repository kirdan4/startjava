public class GuessNumber {
	public static void main(String[] args) {
		int compGeneratedNumber = 51;
		int max = 100;
		int min = 1;
		int playerNumber = max / 2;
		while (playerNumber != compGeneratedNumber) {
			 if (playerNumber > compGeneratedNumber) {
				System.out.printf("\nТвоё число %d. Загаданное число меньше. Попробуй еще раз!", playerNumber);
				max = playerNumber - 1;
				playerNumber = (min + max) / 2;
			} else if (playerNumber < compGeneratedNumber) {
				System.out.printf("\nТвоё число %d. Загаданное число больше. Попробуй еще раз!", playerNumber);
				min = playerNumber + 1;
				playerNumber = (max + min) / 2;
			}
		}
		System.out.printf("\nТвоё число %d. Ты победил!\n", playerNumber);
	}
}
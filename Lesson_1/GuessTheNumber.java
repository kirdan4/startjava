public class GuessTheNumber {
	public static void main(String[] args) {
		int src = 3;
		int max = 100;
		int min = 1;
		int temp = max / 2;
		while (temp != src) {
			 if (temp > src) {
				System.out.printf("\nТвоё число %d. Загаданное число меньше. Попробуй еще раз!", temp);
				max = temp - 1;
				temp = (min + max) / 2;
			} else if (temp < src) {
				System.out.printf("\nТвоё число %d. Загаданное число больше. Попробуй еще раз!", temp);
				min = temp + 1;
				temp = (max + min) / 2;
			}
		}
		System.out.printf("\nТвоё число %d. Ты победил!\n", temp);
	}
}
public class WolfTest {
	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();
		wolfOne.name = "Akella";
		wolfOne.gender = "male";
		wolfOne.age = 10;
		wolfOne.weight = 60.5f;
		wolfOne.color = "white";
		System.out.println("Name = " + wolfOne.name);
		System.out.println("gender = " + wolfOne.gender);
		System.out.println("age = " + wolfOne.age);
		System.out.println("weight = " + wolfOne.weight);
		System.out.println("color = " + wolfOne.color);
		wolfOne.go();
		wolfOne.run();
		wolfOne.sit();
		wolfOne.howl();
		wolfOne.hunt();
		wolfOne.miss();
	}
}
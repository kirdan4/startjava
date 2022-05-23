public class WolfTest {
	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();
		wolfOne.setName("Akella");
		wolfOne.setGender("male");
		wolfOne.setAge(7);
		wolfOne.setWeight(50.5f);
		wolfOne.setColor("white");
		System.out.println("Name = " + wolfOne.getName());
		System.out.println("gender = " + wolfOne.getGender());
		System.out.println("age = " + wolfOne.getAge());
		System.out.println("weight = " + wolfOne.getWeight());
		System.out.println("color = " + wolfOne.getColor());
		wolfOne.go();
		wolfOne.run();
		wolfOne.sit();
		wolfOne.howl();
		wolfOne.hunt();
		wolfOne.miss();
	}
}
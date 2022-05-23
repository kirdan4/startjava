public class Wolf {
	private String name;
	private String gender;
	private int age;
	private float weight;
	private String color;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 8) {
			System.out.println("Некорректный возраст");
		} else {
		this.age = age;
		}
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void go() {
		System.out.println(name + " goes");
	}

	public void run() {
		System.out.println(name + " running");
	}

	public void sit() {
		System.out.println(name + " sat");
	}

	public void howl() {
		System.out.println(name + " howl");
	}

	public void hunt() {
		System.out.println(name + " hunt");
	}

	public void miss() {
		System.out.println(name + " missed!");
	}
}
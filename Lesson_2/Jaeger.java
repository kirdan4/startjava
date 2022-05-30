public class Jaeger {
	private String name;
	private String origin;
	private String mark;
	private double height;
	private double weight;
	private int strength;
	private int kaijuKilled = 0;
	private String status = "Acting";

	public Jaeger(){}

	public Jaeger(String name,String origin, String mark, double height, double weight, int strength) {
		this.name = name;
		this.origin = origin;
		this.mark = mark;
		this.height = height;
		this.weight = weight;
		this.strength = strength;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getStrength() {
		return strength;
	}

	public int getKaijuKilled() {
		return kaijuKilled;
	}

	public String getStatus() {
		return status;
	}

	public boolean drift() {
		System.out.println(name + ": - Drift is activated.");
		return true;
	}

	public void move() {
		System.out.println(name + " goes.");
	}

	public String scanKaiju() {
		return name + " skaning. Kaiju is detected.";
	}

	public void punch() {
		System.out.println(name + " punched.");
	}

	public void getDamaged(int damage) {
		if (strength >= damage) {
			strength -= damage;
		} else {
			strength = 0;
		}
		if (strength == 0) {
			status = "Destroyed";
		}
		System.out.printf("%s got hurt (%d).%n", name, damage);
	}

	public String burstUp() {
		return name + " exploded.";
	}

	public void adKillKaiju(int additionalKilled) {
		System.out.printf("%s killed the Kaiju.%n", name);
		kaijuKilled += additionalKilled;
	}

	public boolean isReadytoBattle() {
		if (strength > 0) {
			System.out.printf("%s is ready to battle. Strength = %d. Status - %s.%n", name, strength, status);
			return true;
		}
		System.out.println("Strength = " + strength);
		System.out.println(name + " " + status);
		return false;
	}

	public String toString() {
		return "Jaeger [name = " + name + ", origin = " + origin + ", mark = " + mark + ", height = " + height + ", weight = "
				+ weight + ", strength = " + strength + ", kaijuKilled = " + kaijuKilled + ", status = " + status + "]";
	}
}
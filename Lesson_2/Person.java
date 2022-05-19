public class Person {

// 		Создайте класс Person (без метода main)
// 		Напишите в нем поля (атрибуты), описывающие характеристики человека: 
	// пол, имя, рост, вес, возраст
// 		Проинициализируйте их какими-то значениями
// 		Создайте в классе методы, описывающие поведение (что он может делать)
	// человека: идти, сидеть, бежать, говорить, учить Java
	String name = "Alex";
	String sex = "men";
	int age  = 18;
	float height = 180;
	float weight = 180;

	public void go() {
		System.out.println("Man goes");
	}

	public void run() {
		System.out.println("Man running");
	}

	public void sit() {
		System.out.println("Man sat");
	}

	public void jump() {
		System.out.println("Man jumped");
	}

	public void sayHello() {
		System.out.println("Man said Hello");
	}

	public void learnJava() {
		System.out.println("Man learning java");
	}
}

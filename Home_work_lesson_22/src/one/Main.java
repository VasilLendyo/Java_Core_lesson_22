package one;

interface Pet {
	void voice();
}

public class Main {

	public static void main(String[] args) {

		Pet cat = () -> System.out.println("I'm a cat, Meow-Meow");
		Pet dog = () -> System.out.println("I am dog, gau, gau");
		Pet cow = () -> System.out.println("I am cow, muu, muu");

		cat.voice();
		dog.voice();
		cow.voice();
	}
}

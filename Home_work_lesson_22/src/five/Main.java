package five;

interface Amphibia {
	void toDo();
}

public class Main {

	public static void main(String[] args) {

		Amphibia frogEat = () -> System.out.println("I am eating");
		Amphibia frogSleep = () -> System.out.println("I am sleeping");
		Amphibia frogSwim = () -> System.out.println("I am swiming");
		Amphibia frogWalk = () -> System.out.println("I am walking");

		frogEat.toDo();
		frogSleep.toDo();
		frogSwim.toDo();
		frogWalk.toDo();
	}
}

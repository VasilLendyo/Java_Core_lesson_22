package two;

import java.util.Random;

interface Coin {
	void coinThrow();
}

public class Main {

	public static void main(String[] args) {

		Coin newThrow = () -> {
			Random random = new Random();
			String side = random.nextBoolean() ? "Reshka" : "Orel";
			System.out.println("It is: " + side);
		};

		newThrow.coinThrow();
	}
}

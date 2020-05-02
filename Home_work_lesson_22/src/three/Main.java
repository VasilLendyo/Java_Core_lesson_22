package three;

interface Numeric<T> {
	T value();
}

public class Main {

	public static void main(String[] args) {

		Numeric<Double> doubleMin = () -> Double.MIN_VALUE;
		Numeric<Double> doubleMax = () -> Double.MAX_VALUE;
		Numeric<Float> floatMin = () -> Float.MIN_VALUE;
		Numeric<Float> floatMax = () -> Float.MAX_VALUE;

		System.out.println("Min double value is: " + doubleMin.value());
		System.out.println("Max double value is: " + doubleMax.value());
		System.out.println("Min float value is: " + floatMin.value());
		System.out.println("Max float value is: " + floatMax.value());
	}
}

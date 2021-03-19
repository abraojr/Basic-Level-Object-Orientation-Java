package application;

public class Program {

	public static void main(String[] args) {

		// boxing
		int x = 20;

		Object obj1 = x;

		System.out.println(obj1);

		// unboxing
		int y = 10;

		Object obj2 = y;
		int z = (int) obj2;

		System.out.println(z);

		// wrapper classes
		Integer w = 10;
		int v = w * 4;

		System.out.println(v);
	}
}

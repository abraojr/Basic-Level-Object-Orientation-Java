package application;

import java.util.Locale;
import java.util.Scanner;
import util.Calculator;

public class Program {

	public static void main(String[] args) {

		/*
		 * Make a program to read any numerical value, and then show how much would be
		 * the value of a circumference and the volume of a sphere for a radius of that
		 * value. Also inform the PI value to two decimal places.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();

		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);

		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f", Calculator.PI);

		sc.close();
	}
}

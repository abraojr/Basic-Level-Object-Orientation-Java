package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
	public static void main(String[] args) {

		 /*Make a program to read the data of a product in stock (name, price and quantity in stock). Then:
         * • Show product data (name, price, quantity in stock, total value in stock)
         * • Make a stock entry and show the product data again
         * • Make a check in the stock and show the product data again*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		Product product = new Product(name, price, quantity);

		System.out.println("\nProduct data: " + product);
		System.out.print("\nEnter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);

		System.out.println("\nUpdated data: " + product);
		System.out.print("\nEnter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		System.out.println("\nUpdated data: " + product);
		sc.close();
	}
}
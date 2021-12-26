package aplication;

import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Set<Product> set = new TreeSet<>();
		
		set.add(new Product("tv", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		set.add(new Product("tv", 900.0));
		for (Product p : set) {
			System.out.println(p);
		}
		sc.close();
		
	}
}

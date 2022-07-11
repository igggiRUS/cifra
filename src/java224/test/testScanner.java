package test;

import java.util.Scanner;

public class testScanner {
	public static void main(String[] args) {
		System.out.println("input");
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			int number = sc.nextInt();
			sc.close();
			System.out.println("out " + number);
		} else {
			System.err.println("Это не число");

		}
	}
}

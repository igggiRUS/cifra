package lesson06;

import java.util.Scanner;

public class task01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Первое число: ");
		double startBorder = sc.nextDouble();
		System.out.println("Второе число: ");
		double endBorder = sc.nextDouble();
		System.out.println("Число между число: ");
		double possibleCentr = sc.nextDouble();
		sc.close();
		// меньше И больше И число
		if (startBorder <= possibleCentr && possibleCentr <= endBorder) {
			System.out.println("В интервале");
		} else {
			System.out.println("за интервалом");
			System.out.println("o_______O");
		}
	}
}
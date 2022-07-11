package test;

import java.util.Scanner;

public class task06 {
	public static void main(String[] args) {
		System.out.println("Введите год и мы выясним високосный он или нет: ");
		Scanner sc = new Scanner(System.in);
		// будет время надо условие сделать проверка с 1582 года
		if (sc.hasNextInt()) {
			int year = sc.nextInt();
			sc.close();
//			System.out.println("Это число прошло проверку " + year);
			if (((year % 4) == 0 && (year % 100) == 0 && (year % 400) != 0 && (year >= 1582))) {
				System.out.println("Обычный год");
			} else if (year % 4 == 0 && (year >= 1582)) {
				System.out.println("Високосный");
			} else {
				System.out.println("Обычный год");
			}
			}
		else
		{
			System.err.println("Это не число");
		}
	}
}
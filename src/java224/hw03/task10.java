package hw03;

import java.util.Scanner;

public class task10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("номер кв");
		int n = sc.nextInt();
		System.out.println("кол-во кв на этаже");
		int m = sc.nextInt();
		sc.close();

		System.out.println("Подъезд № " + (n / (m * 9)));
	}
}

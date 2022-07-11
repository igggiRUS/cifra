package hw03;

import java.util.Scanner;

public class task08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("inpun number");
		int a = sc.nextInt();
		System.out.println("inpun number");
		int b = sc.nextInt();
		sc.close();
		System.out.println(a + " " + b);
		if ((a % 2) == 0 && (b % 2) == 0) {
			System.out.println("Ответ: Yes");
		} else if (((a % 1) == 0 && (b % 1) == 0) && ((a % 2) != 0 && (b % 2) != 0)) {
			System.out.println("Ответ: Yes");
 		} else {
//			System.err.println("Ответ: No");

		}
	}

}

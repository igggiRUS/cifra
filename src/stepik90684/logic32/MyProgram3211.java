package stepik90684.logic32;

import java.util.Scanner;
/**
 * На входе 2 числа четных одно не четное
 * Если верно то true
 *
 */

public class MyProgram3211 {
	public static void main(String[] args) {
		String str = "4 6 7";
		Scanner sc = new Scanner(str);
//		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		if (a % 2 + b % 2 + c % 2 == 1 ) {
			System.out.println(true);
		} else {
			System.out.println(false);
		
		}
	}
}
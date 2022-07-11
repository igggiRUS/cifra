package ifElse31;

import java.util.Scanner;

public class MyProg317 {
	public static void main(String[] args) {
		String str = "5 6 12";
		Scanner sc = new Scanner(str);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		System.out.printf("%d %d %d", a, b, c);
		System.out.println();
		if (a > b && a > c) {
			System.out.println(a);
		} else if (b > c && b > a) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}
	}
}

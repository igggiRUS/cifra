package stepik90684.test28;

import java.util.Scanner;

class MyProgram289 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("in1");
		int one = sc.nextInt();
		System.out.println("in1 " + one);
		System.out.println("in2");
		int two = sc.nextInt();
		System.out.println("in2 " + two);
		sc.close();
		System.out.println("Сложение: " + one + " + " + two + " = " + (one + two));
		System.out.println("Вычитание: " + one + " - " + two + " = " + (one - two));

	}
}
// String oneStr = sc.nextLine();
// String twoStr = sc.nextInt();
// int one = Integer.parseInt(oneStr);
// int two = Integer.parseInt(twoStr);
//			System.out.println(one + " + " + two + " = " + (one + two));
// System.out.printf("%d + %d = %d", one, two );
// System.out.printf("%d - %d = %d", one, two);

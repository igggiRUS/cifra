package stepik90684.string27;

import java.util.Scanner;

public class MyProgram2713 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ввод двух int
		int one = sc.nextInt();
		int two = sc.nextInt();
		sc.close();
		// сложение int
		int three = one + two;
		System.out.println(three);
		// преобразовать int в String
		Integer.toString(one);
		Integer.toString(two);
		System.out.println(one + "" + two);
//	преобразование стринг в int
// 	Integer i = Integer.parseInt(s);
	}
}
package stepik90684.string27;

import java.util.Scanner;

public class MyProgram2715v2 {
	public static void main(String[] args) {
		String input = "task angel";
		Scanner sc = new Scanner(input);
//		забирает до пробела автоматически разделяются на слова строчки
		String first = sc.next();
		String second = sc.next();
		sc.close();
		System.out.println(first.charAt(0) < second.charAt(0) ? true : false);

	}
}
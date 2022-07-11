package stepik90684.string27;

import java.util.Scanner;

public class MyProgram277 {

	// выводит первый последний символ слова

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String symbol = sc.nextLine();
		sc.close();
		char v = symbol.charAt(0);
		char x = symbol.charAt(symbol.length() - 1);
		System.out.println(v + "\u0020" + x);
	}
}

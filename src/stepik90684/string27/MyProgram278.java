package stepik90684.string27;

import java.util.Scanner;

public class MyProgram278 {
// сравнивает наличие одинаковых слов
	
//	My name is John
//	name
//	true
	
//	My name is John
//	john
//	false
	
	
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		String firstWord = sc.nextLine();
		String secondWord = sc.nextLine();
		sc.close();
//		int x1 = firstWord.length();
//		int x2 = secondWord.length();
//		System.out.println(x1);
//		System.out.println(x2);
		boolean value1 = firstWord.contains(secondWord);
		System.out.println(value1);

	}
}

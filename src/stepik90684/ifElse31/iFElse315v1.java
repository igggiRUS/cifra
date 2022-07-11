package stepik90684.ifElse31;

import java.util.Scanner;

/*
 * Вычисляем длинну строк
 * решение через  if else
 */

public class iFElse315v1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		int a = str1.length();
		String str2 = sc.nextLine();
		int b = str2.length();
		sc.close();
		System.out.println(a);
		System.out.println(b);
		if (a > b) {
			System.out.println("Махатма");
		} else {
			System.out.println("Джавахарлал");

		}
	}
}
//	После решения задачи посмотрел решения других
// ======================
//		int a = sc.nextLine().length();
//		int b = sc.nextLine().length();
//      if(a>b)


// ======================
//     	String str1 = sc.nextLine();
//		String str2 = sc.nextLine();
//		if (str1.length() > str2.length())


//
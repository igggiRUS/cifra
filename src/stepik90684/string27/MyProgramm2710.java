package stepik90684.string27;

import java.util.Scanner;

public class MyProgramm2710 {
//		На вход подаётся строка, а затем целое число n > 0. Выведите n- й символ с начала строки. 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = sc.nextInt();
		sc.close();
		char j = str.charAt(--n);
		System.out.println(j);
//		System.out.println(str.substring(--n, 1));
	}
}

package stepik90684.logic32;

import java.util.Scanner;

/*
 * На вход подаются целых три числа - день, месяц и год (по григорианскому календарю).
 *  Выведите true, если эти числа составляют валидную дату, и false - в противном случае.
 *  
 * 
 */
public class MyProgram3212boolean {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int m = sc.nextInt();
		int y = sc.nextInt();
		boolean a = (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) && (d < 32) && (d > 0)
				&& (y >= 0);
		boolean b = (m == 4 || m == 6 || m == 9 || m == 11) && (d < 31) && (d > 0) && (y >= 0);
		boolean c = (m == 2) && (d < 29) && (d > 0) && (y >= 0);
		boolean z = (m == 2) && (d < 30) && (d > 0) && (((y % 400 == 0) || (y % 4 == 0)) && (y % 100 != 0));
		System.out.print(a || b || c || z);
	}
}
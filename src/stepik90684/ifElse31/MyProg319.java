package ifElse31;

import java.util.Scanner;

public class MyProg319 {
	public static void main(String[] args) {
// решение через тернарный оператор
//		String str = "5 10";
//		Scanner sc = new Scanner(str);
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		sc.close();
		System.out.println(a < b ? "Бой продолжается!" : "Холифилд - чемпион!" );
	}
}

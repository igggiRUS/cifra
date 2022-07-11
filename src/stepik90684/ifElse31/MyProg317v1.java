package ifElse31;

import java.util.Scanner;

public class MyProg317v1 {
	public static void main(String[] args) {
//		String str = "5 6 12";
//		Scanner sc = new Scanner(str);
		Scanner in = new Scanner(System.in);
		System.out.print(Math.max(in.nextInt(), Math.max(in.nextInt(), in.nextInt())));
		in.close();

	}
}

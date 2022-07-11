package ifElse31;

import java.util.Scanner;

public class MyProg3111 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        System.out.println(a % 7 > 0 ? "NO" : "YES");
	}
}

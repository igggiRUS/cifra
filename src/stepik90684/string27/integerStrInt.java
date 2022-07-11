package stepik90684.string27;

import java.util.Scanner;

public class integerStrInt{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//	String word = sc.next() 
//	String str = sc.nextLine();
		String strNum = sc.nextLine();
		sc.close();
//	Читай про методы substring() и indexOf() (см. 2.7.5 - там подсказки)

		Integer num = Integer.valueOf(strNum);
		int num1 = num;
		int b = 10;
		System.out.println(num1 + b);
		
		
	}

}

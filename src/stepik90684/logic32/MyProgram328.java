package stepik90684.logic32;

import java.util.Scanner;

public class MyProgram328 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String str1 = sc.nextLine();
			String str2 = sc.next();
			sc.close();
			// сравнил строку с буквой И длинну строки с цифрой 20
	        if ((str1.contains(str2) || (str1.length() > 20))) {
	            System.out.println("YES");
	        } else {
	            System.out.println("NO");
	        }
	    }
	}

package stepik90684.string27;

import java.util.Scanner;

public class MyProgram2712 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			// ввод двух строк
	        String one = sc.nextLine();
			String two = sc.nextLine();
	        sc.close();
	        // объединение строк в одну
	        String three = one + " " + two;
	      	System.out.println(three);
		    //	Подсчет длинны строки
	        int length = three.length();
			System.out.println(length);
		}

	}

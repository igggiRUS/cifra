package hw03;

import java.util.Scanner;

public class task07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите символ:");
		// поставил charAt() индекс позиции незнаю как но это сработало и символ превратился в char
		char ch = sc.next().charAt(0);
		// приведение буквы к позиции unicode
		System.out.println("позиция в Unicode: " + ((int) ch));
		sc.close();

		if ((char) 48 <= ch && ch <= (char) 57) {
			System.out.println("Цифра");
		} else if ((char) 1040 <= ch && ch <= (char) 1103) {
			System.out.println("Русские буквы");
		} else if ((char) 65 <= ch && ch <= (char) 122) {
			System.out.println("Латинские буквы");
		} else {
			System.err.println("символ не относится ни к цифрам ни к буквам");
		}

	}
}

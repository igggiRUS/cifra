package hw03;

import java.util.Scanner;
/**
 * Cчитает счатливый ли билет или нет
 * @author misha
 *
 */
public class task12 {
	public static void main(String[] args) {
		System.out.println("Введите шестизначное целое число: ");
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		sc.close();
		System.out.println("Вы ввели число: " + num);
		// по индексу забирает из строки числа
		char a = num.charAt(0);
		char b = num.charAt(1);
		char c = num.charAt(2);
		char d = num.charAt(3);
		char e = num.charAt(4);
		char f = num.charAt(5);
		// преобразует Unicode значения в реальное значение символа
		int a1 = Character.getNumericValue(a);
		int b1 = Character.getNumericValue(b);
		int c1 = Character.getNumericValue(c);
		int d1 = Character.getNumericValue(d);
		int e1 = Character.getNumericValue(e);
		int f1 = Character.getNumericValue(f);
		
		
		if ((a1 + b1 + c1) == (d1 + e1 + f1)) {
			System.out.println("Да");
		} else {
			System.out.println("Нет");
		}
	}
}
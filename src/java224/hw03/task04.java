package hw03;

import java.util.Scanner;
/**
 * 
 * @author misha
 *Задание 4
Дана точка на плоскости заданная координатами x и y,
определить и вывести в консоль, в какой четверти находит-
ся точка, в прямоугольной (декартовой) системе координат.
Четверти обозначены римскими цифрами.

 */

public class task04 {
	public static void main(String[] args) {
//	    Проверка число ли введено


		Scanner sc = new Scanner(System.in);

		System.out.println("Введите X: ");
		int x = sc.nextInt();
		
		System.out.println("Введите Y: ");
		int y = sc.nextInt();
		sc.close();

		if (x < 0 & y < 0) {
			System.out.println("Ответ: III");
		} else if (x > 0 & y > 0) {
			System.out.println("Ответ: I");
		} else if (x > 0 & y < 0) {
			System.out.println("Ответ: IV");
		} else if (x < 0 & y > 0) {
			System.out.println("Ответ: II");
		} else {
			System.out.println("Ответ: Магия");
		}
	}
}

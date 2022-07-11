package hw03;

import java.util.Scanner;

/**
 * Задание 1
Написать программу, которая предлагает пользователю
ввести c клавиатуры номер дня недели, и в ответ показыва-
ет название этого дня (например, 6 – это суббота). Решить с
использованием switch.
 * @author misha
 *
 */

public class task01 {
	public static void main(String[] args) {
		System.out.println("Введите день недели цифрой: ");
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		sc.close();
		switch (day) {
		case 1:
			System.out.println("Понедельник");
			break;
		case 2:
			System.out.println("Вторник");
			break;
		case 3:
			System.out.println("Среда");
			break;
		case 4:
			System.out.println("Четверг");
			break;
		case 5:
			System.out.println("Пятница");
			break;
		case 6:
		case 7:
			System.out.println("Выходные");
			break;
		default:
System.out.println("Попробуйте ввести значение еще раз вы где то промахнулись");
		}
	}
}
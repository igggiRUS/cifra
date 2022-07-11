package test;

import java.util.Scanner;

public class switchCase {
public static void main(String[] args) {


		System.out.println("Введите год: ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		sc.close();
		int yearsChina = (year % 12);


		switch (yearsChina) {
		case 0:
			System.out.println("Обезъяна");
			break;
		case 1:
			System.out.println("Петух");
			break;
		case 2:
			System.out.println("Собака");
			break;
		case 3:
			System.out.println("Свинья");
			break;
		// система исчисления начинается с крысы но мне пришлось ее сместить на 4 место
		// что бы не делать костыли в формуле
		case 4:
			System.out.println("Крыса");
			break;
		case 5:
			System.out.println("Бык");
			break;
		case 6:
			System.out.println("Тигр");
			break;
		case 7:
			System.out.println("Кролик");
			break;
		case 8:
			System.out.println("Дракон");
			break;
		case 9:
			System.out.println("Змея");
			break;
		case 10:
			System.out.println("Лошадь");
			break;
		case 11:
			System.out.println("Коза");
			break;
		default:
			System.out.println("Гейм Овер");
			break;
		}
	
	}

}

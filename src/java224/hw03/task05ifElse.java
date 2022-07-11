package hw03;

import java.util.Scanner;

public class task05ifElse {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите день рождения: ");
		if (sc.hasNextInt()) {
			int dayBirthDay = sc.nextInt();
			if (1 <= dayBirthDay && dayBirthDay < 31) {
				System.err.println("ВХОДИТ в диапозон дней в месяце");
			} else {
				System.out.println("НЕ входит в диапозон дней в месяце");
			}

			System.out.println("Введите месяц рождения: ");

			int mountBirthDay = sc.nextInt();
			if (1 <= mountBirthDay && mountBirthDay < 31) {
				System.err.println("ВХОДИТ в диапозон дней в месяце");
			} else {
				System.out.println("НЕ входит в диапозон дней в месяце");
			}

			System.out.println("Введите год рождения: ");

			int yearBirthDay = sc.nextInt();
			if (-1_000_000 < yearBirthDay && yearBirthDay < 100022) {
				System.err.println("ВХОДИТ в диапозон лет");

				int yearsChina = (yearBirthDay % 12);
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

			} else {
				System.out.println("НЕ входит в диапозон лет");
//				System.out.printf("%0d : %0d : %0d", dayBirthDay, mountBirthDay, yearBirthDay );
				sc.close();
				System.out.println("День: " + dayBirthDay + " Месяц: " + mountBirthDay);
			}
			switch (mountBirthDay) {
			case 1:
				if (dayBirthDay < 22) {
					System.out.println("Козерог");
				} else {
					System.out.println("Водолей");
				}
				break;
			case 2:
				if (dayBirthDay < 20) {
					System.out.println("Водолей");
				} else {
					System.out.println("Рыбы");
				}
				break;
			case 3:
				if (dayBirthDay < 19) {
					System.out.println("Рыбы");
				} else {
					System.out.println("Овен");
				}
				break;
			case 4:
				if (dayBirthDay < 21) {
					System.out.println("Овен");
				} else {
					System.out.println("Телец");
				}
				break;
			case 5:
				if (dayBirthDay < 20) {
					System.out.println("Телец");
				} else {
					System.out.println("Близнецы");
				}
				break;
			case 6:
				if (dayBirthDay < 21) {
					System.out.println("Близнецы");
				} else {
					System.out.println("Рак");
				}
				break;
			case 7:
				if (dayBirthDay < 21) {
					System.out.println("Рак");
				} else {
					System.out.println("Лев");
				}
				break;
			case 8:
				if (dayBirthDay < 23) {
					System.out.println("Лев");
				} else {
					System.out.println("Дева");
				}
				break;
			case 9:
				if (dayBirthDay < 23) {
					System.out.println("Дева");
				} else {
					System.out.println("Весы");
				}
				break;
			case 10:
				if (dayBirthDay < 23) {
					System.out.println("Весы");
				} else {
					System.out.println("Скорпион");
				}
				break;
			case 11:
				if (dayBirthDay < 23) {
					System.out.println("Скорпион");
				} else {
					System.out.println("Стрелец");
				}
				break;
			case 12:
				if (dayBirthDay < 23) {
					System.out.println("Стрелец");
				} else {
					System.out.println("Козерог");
				}
				break;
			default:
				System.err.println("Ошибка");
				break;

			}

		}

	}

}

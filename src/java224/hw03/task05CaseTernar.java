package hw03;

import java.util.Scanner;

public class task05CaseTernar {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите день рождения: ");
		if (sc.hasNextInt()) {
			int dayBirthDay = sc.nextInt();
			if (1 <= dayBirthDay && dayBirthDay < 31) {
//				System.err.println("ВХОДИТ в диапозон дней в месяце");
			} else {
				System.out.println("НЕ входит в диапозон дней в месяце");
			}

			System.out.println("Введите месяц рождения: ");

			int mountBirthDay = sc.nextInt();
			if (1 <= mountBirthDay && mountBirthDay < 31) {
//				System.err.println("ВХОДИТ в диапозон дней в месяце");
			} else {
				System.out.println("НЕ входит в диапозон дней в месяце");
			}

			System.out.println("Введите год рождения: ");

			int yearBirthDay = sc.nextInt();
			if (-1_000_000 < yearBirthDay && yearBirthDay < 100022) {
//				System.err.println("ВХОДИТ в диапозон лет");

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
				String answer1 = mountBirthDay == 1 && dayBirthDay < 22 ? "Козерог" : "Водолей";
				System.out.println(answer1);
				break;				
			case 2:
				String answer2 = mountBirthDay == 2 && dayBirthDay < 22 ? "Водолей" : "Рыба";
				System.out.println(answer2);
				break;
			case 3:
				String answer3 = mountBirthDay == 3 && dayBirthDay < 20 ? "Рыба" : "Овен";
				System.out.println(answer3);
				break;
			case 4:
				String answer4 = mountBirthDay == 4 && dayBirthDay < 21 ? "Овен" : "Телец";
				System.out.println(answer4);
				break;
			case 5:
				String answer5 = mountBirthDay == 5 && dayBirthDay < 20 ? "Телец" : "Близнецы";
				System.out.println(answer5);
				break;
			case 6:
				String answer6 = mountBirthDay == 6 && dayBirthDay < 21 ? "Близнецы" : "Рак";
				System.out.println(answer6);
				break;
			case 7:
				String answer7 = mountBirthDay == 7 && dayBirthDay < 21 ? "Рак" : "Лев";
				System.out.println(answer7);
				break;
			case 8:
				String answer8 = mountBirthDay == 8 && dayBirthDay < 23 ? "Лев" : "Дева";
				System.out.println(answer8);
				break;
			case 9:
				String answer9 = mountBirthDay == 9 && dayBirthDay < 22 ? "Дева" : "Весы";
				System.out.println(answer9);
				break;
			case 10:
				String answer10 = mountBirthDay == 10 && dayBirthDay < 23 ? "Весы" : "Скорпион";
				System.out.println(answer10);
				break;
			case 11:
				String answer11 = mountBirthDay == 11 && dayBirthDay < 22 ? "Скорион" : "Стрелец";
				System.out.println(answer11);
				break;
			case 12:
				String answer12 = mountBirthDay == 12 && dayBirthDay < 23 ? "Стрелец" : "Козерог";
				System.out.println(answer12);
				break;
			default:
				System.err.println("Ошибка");
				break;

			}

		}

	}

}

package test;

//import java.time.MonthDay;
import java.util.Scanner;

public class ifElseScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.close();
		System.out.println("Введите день рождения: ");
		if (sc.hasNextInt()) {
						int dayBirthDay = sc.nextInt();
			if (1 < dayBirthDay && dayBirthDay < 31) {
				System.out.println("ВХОДИТ");
			} else {
				System.out.println("НЕ входит");

			}
		}
	}
}
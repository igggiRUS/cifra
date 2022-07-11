package hw02;

import java.util.Scanner;

// 914400 +300 +33
public class task11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите секунды до нового года: ");
		int newYear = sc.nextInt(); 
		sc.close();
		// int newYear = 914733;
		int seconds = 60;
		int minute = 60;
		int hour = minute * seconds;
		int day = 24 * hour;
		int d1 = newYear / day;
		int h1 = (newYear % day) / hour;
		int m1 = (newYear % hour) / minute;
		int s1 = (newYear % hour) % minute;
		System.out.println(d1 + " Дней " + h1 + " Часов " + m1 + " Минут " + s1 + " Секунд");
	}
}

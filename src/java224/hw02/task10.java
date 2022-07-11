package hw02;

import java.util.Scanner;

public class task10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите свой Рост: ");
		int h = sc.nextInt();
		System.out.println("Введите свой Вес: ");
		int w = sc.nextInt();
		sc.close();
		final int dwarf = 110;
		int youIdeal = h - dwarf;

		System.out.println(
				"При росте: " + h + "\n" + "Ваш идеальный вес: " + youIdeal + "\n" + "Ваш действительный вес: " + w);
		int youW = w - youIdeal;
		System.out.println("Разница от идеального веса: " + youW);

		if (youW == 0) {
			System.out.println("Ты идеален");
		} else if (youW > -5 & youW < 5) {
			System.out.println("вы поправились");
		} else if (youW > 6 & youW < 20) {
			System.out.println("Мисье вы превращаетесь в Винни Пуха!");
		} else if (youW < -6 & youW > -20) {
			System.out.println("Придется ходить с кирпичем в кармане");
		} else {
			System.out.println("Срочно к диетологу!!!");
		}
	}
}
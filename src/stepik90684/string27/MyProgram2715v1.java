package stepik90684.string27;

import java.util.Scanner;

public class MyProgram2715v1 {
	public static void main(String[] args) {
//		String input = "task angel";
		Scanner sc = new Scanner(System.in);
//		забирает строку целиком
		String word = sc.nextLine();
		sc.close();
//		Проверка входа
//		System.out.println(word);
//		Найдем пробел
		int x = word.indexOf(' ');
//	    Проверка
//		System.out.println("позиция пробела по индексу  " + x);
//		разделили строчки
		String first = word.substring(0, x);
		String second = word.substring(++x);
		// Решаем через тернарный оператор (если А < B ? true : false) (ВОПРОС: А больше
		// Б ? (ДА) правда : (НЕТ) ложь)
		System.out.println(first.charAt(0) < second.charAt(0) ? true : false);

	}
}
package hw03;

import java.util.Scanner;

/**
 * Задание 2
С клавиатуры вводится время (количество часов от 0 до
24) – программа выводит приветствие, соответствующее
введенному времени (например, ввели 15 часов – выводится
приветствие «Добрый день»).
 * @author misha
 *
 */
public class task02 {
public static void main(String[] args) {
//		    Проверка число ли введено
	System.out.println("Введите время: ");
Scanner sc = new Scanner(System.in);
int time = sc.nextInt();
sc.close();

    if (time >= 4 & time <= 11) {
        System.out.println("Доброе утро");
    } else if (time >= 12 & time <= 17) {
        System.out.println("Добрый день");
    } else if (time >= 18 & time <= 22) {
        System.out.println("Добрый вечер");
    } else if (time >= 23 & time <= 24) {
        System.out.println("Доброй ночи");
        } else if (time >= 0 & time <= 3) {
        System.out.println("Доброй ночи");
    } else {
        System.out.println("o___O");
    }
}
}
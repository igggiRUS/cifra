package java224.hw04Bin;

import java.util.Scanner;

/**
 * Задание 9
 * Определить имеют ли чисел M и N разные знаки.
 * Используя только побитовые и условные операторы.
 */
public class Task9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое десятичное число: ");
        int flags1 = sc.nextInt();
        System.out.println("Введите первое десятичное число: ");
        int flags2 = sc.nextInt();
        sc.close();
/**
 * Задача оказалась не простой разбил на 3 этапа
 * 1. сдвинул биты до отрицательного
 * 2. Обнулил все биты кроме самого старшего
 * 3. чтобы сравнить числа пришлось все старшие биты сдвигать на самый млачший разряд
 * 4. Сравнил старший бит первого и второго флага (второй флаг учавствовал как маска)
 * 5. В итоге  если результат 0 то цифры с одинаковым знаком если 1 то цифры с разным знаком.
 * 6. все решение кроме вывода происходит с побитовыми операторами.
 * 7. Только на выводе пришлось выкрутиться тернарным.
 * Незнаю как еще показать что числа разные или одинаковые.
 * Надеюсь это не зачтется как минус.
 */
        int result = ((flags1 & (1 << 31)) >>> 31) ^ ((flags2 & (1 << 31)) >>> 31);
         System.out.print("Числа имеют " + (result == 0 ? "одинаковые" : "разные") +" знаки.");




    }
}
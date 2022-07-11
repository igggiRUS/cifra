package java224.hw04Bin;

import java.util.Scanner;

/**
 * Задание 7
 * Определить значение i-го бита числа N. Вывести резуль-
 * тат на консоль в двоичном виде.
 */

public class Task7 {
    public static void main(String[] args) {

        System.out.println("Укажите порядковый номер бита n <= 32: ");
        Scanner sc = new Scanner(System.in);
        int shift = sc.nextInt();
        sc.close();

        int flags = -1431655766;
        byte mask = 0b01;

        int result = flags & (mask << shift);
        System.out.printf(
                "\n%32s \n%32s = \n%32s\n",
                (Integer.toBinaryString(flags)),
                (Integer.toBinaryString((mask << shift))),
                (Integer.toBinaryString(result)));
    }
}
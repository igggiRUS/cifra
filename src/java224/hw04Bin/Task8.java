package java224.hw04Bin;

import java.util.Scanner;

/**
 * Задание 8
 * Обнулить крайний левый (старший разряд) единичный
 * бит числа N. Вывести результат на консоль в двоичном виде.
 */

public class Task8 {
    public static void main(String[] args) {

//        System.out.println("Укажите порядковый номер бита n = 24: ");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt(); // степень порядок бита
//        sc.close();

        int flags = -1431655766;
        int mask = 255;
        int n = 24;
//        блок для тестов
//                int n = 12;
//        int z = ~(mask << n);
//        int result = flags & z;
//        System.out.printf("\n%32s \n%32s = \n%32s\n", (Integer.toBinaryString(flags)), (Integer.toBinaryString(z)), (Integer.toBinaryString(result)));

        int result = flags & ~(mask << n);
        System.out.printf("\n%32s & \n%32s = \n%32s\n", (Integer.toBinaryString(flags)), (Integer.toBinaryString((~(mask << n)))), (Integer.toBinaryString(result)));
        System.out.printf("\n%32d & \n%32d =\n%32d", flags, mask, result);
    }
}
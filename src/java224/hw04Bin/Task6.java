package java224.hw04Bin;
/**
 * Задание 6
 * Обнулить все кроме последних i битов числа N. Вывести
 * результат на консоль в двоичном виде.
 */

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        System.out.println("Укажите порядковый номер бита n <= 32: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // степень порядок бита
        sc.close();

        int flags = -1431655766;
//        int mask = -1; // десятичное число для проверки
        byte mask = 0b01;

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


package java224.hw04Bin;

import java.util.Scanner;

/**
 * Задание 4
 * Инвертировать i-й бит числа N. Вывести результат на
 * консоль в двоичном виде.
 * 10101010_10101010_10101010_10101010 ^  ROX двойное отрицание интвертирует число на другое
 * 00000000_00000000_00000100_00100000 =
 * 10101010_10101010_10101110_10001010   там где стояли маски флаги поменяли значение
 */

public class Task4Invers {
    public static void main(String[] args) {
        System.out.println("Укажите порядковый номер бита n <= 32: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // степень порядок бита
        sc.close();

        int flags = -1431655766;
        byte mask = 0b01;
/*
        блок для тестов
                int n = 12;
        int z = (mask << n);
        int result = flags ^ z;
        System.out.printf("\n%32s \n%32s = \n%32s\n", (Integer.toBinaryString(flags)), (Integer.toBinaryString(z)), (Integer.toBinaryString(result)));
 */
        int result = flags ^ (mask << n);
        System.out.printf("\n%32s ^ \n%32s = \n%32s\n", (Integer.toBinaryString(flags)), (Integer.toBinaryString((mask << n))), (Integer.toBinaryString(result)));
//        System.out.printf("\n%32d ^ \n%32d =\n%32d", flags, mask, result);
    }
}


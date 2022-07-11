package java224.hw04Bin;

import java.util.Scanner;

/**
 * Задание 5
 * Установить i-й бит числа N равным 0. Вывести результат
 * на консоль в двоичном виде.
 */
public class Task5Rox {
    public static void main(String[] args) {

        System.out.println("Укажите порядковый номер бита n <= 32: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // степень порядок бита
        sc.close();

        int flags = -1;
//        int flags = 1073741824;
        byte mask = 0b01;
/*
        блок для тестов
                int n = 12;
        int z = (mask << n);
        int result = flags ^ z;
        System.out.printf("\n%32s \n%32s = \n%32s\n", (Integer.toBinaryString(flags)), (Integer.toBinaryString(z)), (Integer.toBinaryString(result)));
 */
        int result = flags ^ (mask << n);
        System.out.printf("\n%32s ^\n%32s = \n%32s\n", (Integer.toBinaryString(flags)), (Integer.toBinaryString((mask << n))), (Integer.toBinaryString(result)));
        System.out.printf("\n%32d ^\n%32d =\n%32d", flags, mask, result);
    }
}


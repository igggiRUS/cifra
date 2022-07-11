package java224.hw04Bin;

import java.util.Scanner;

/**
 * Задание 3
 * Установить i-й бит числа N равным 1. Вывести результат
 * на консоль в двоичном виде.
 * <p>
 * 3 разряд 2 разряд 1 разряд 0 разряд
 * 01000000_00000000_00000000_00000000 | Побитовое И OR  (побитовое сложение)
 * 00000000_00000000_10000000_00000000 = включая флаг вы прибавляете к числу побитовое значение
 * 01000000_00000000_10000000_00000000
 */

public class Task3Or {
    public static void main(String[] args) {

        System.out.println("Укажите порядковый номер бита n <= 32: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // степень порядок бита
        sc.close();

        int flags = 1073741824;
        byte mask = 0b01;
        /*
        блок для тестов
                int n = 12;
        int z = (mask << n);
        int result = flags | z;
        System.out.printf("\n%32s \n%32s = \n%32s\n", (Integer.toBinaryString(flags)), (Integer.toBinaryString(z)), (Integer.toBinaryString(result)));
        */
        int result = flags | (mask << n);
        System.out.printf("\n%32s | Указал отрицательное что бы были нули\n%32s = \n%32s\n", (Integer.toBinaryString(flags)), (Integer.toBinaryString((mask << n))), (Integer.toBinaryString(result)));
        System.out.printf("\n%32d |\n%32d =\n%32d", flags, mask, result);
    }
}
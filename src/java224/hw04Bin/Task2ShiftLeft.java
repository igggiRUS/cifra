package java224.hw04Bin;

import java.util.Scanner;

/**
 * Задание 2
 * Вывести на консоль 2 в степени n. Для вычисления ис-
 * пользовать только побитовые операции.
 * <p>
 * 3 разряд 2 разряд 1 разряд 0 разряд
 * 00000001_01101111_01110110_00111011 << побитовое возведение в степень (Побитовый сдвиг в лево на указанное колличество битов)
 * 00000000_00000000_00000000_00000010 =
 * 00000010_11011110_11101100_01110010  все сдвинулось на один бит в лево
 */
public class Task2ShiftLeft {
    public static void main(String[] args) {

        System.out.println("Возводим 2 ** n\nВведите степень n:");
        Scanner sc = new Scanner(System.in);
        int mask = sc.nextInt();
        sc.close();
        int flags = 2;
        int result = flags << mask;
        System.out.printf("\n%32s << (число 2 побитовое << смещение на бит в лево в десятичной форме возведение в степень 2)\n%32s = \n%32s\n", (Integer.toBinaryString(flags)), (Integer.toBinaryString(mask)), (Integer.toBinaryString(result)));
        System.out.printf("\n%32d <<\n%32d =\n%32d", flags, mask, result);


    }
}

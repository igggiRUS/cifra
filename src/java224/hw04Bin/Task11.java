package java224.hw04Bin;

import java.util.Scanner;

/**
 * Задание 11
 *  Посчитать и вывести на консоль количество единичных
 *  битов в числе N. Вывести на консоль исходное число в дво-
 *  ичном виде и результат.
 *   = ~flags & (mask << shift0);
 */
public class Task11 {
    public static void main(String[] args) {
//-1431655766
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int flags = sc.nextInt();
        sc.close();
        byte mask = 0b1;
// Сдвиг каждого бита
        int shift0 = 0;
        int shift1 = 1;
        int shift2 = 2;
        int shift3 = 3;
        int shift4 = 4;
        int shift5 = 5;
        int shift6 = 6;
        int shift7 = 7;
        int shift8 = 8;
        int shift9 = 9;
        int shift10 = 10;
        int shift11 = 11;
        int shift12 = 12;
        int shift13 = 13;
        int shift14 = 14;
        int shift15 = 15;
        int shift16 = 16;
        int shift17 = 17;
        int shift18 = 18;
        int shift19 = 19;
        int shift20 = 20;
        int shift21 = 21;
        int shift22 = 22;
        int shift23 = 23;
        int shift24 = 24;
        int shift25 = 25;
        int shift26 = 26;
        int shift27 = 27;
        int shift28 = 28;
        int shift29 = 29;
        int shift30 = 30;
        int shift31 = 31;
        int shift32 = 32;

        //        флаг отрицательный  что бы нули стали положительные
        //        а после сложить и понять были они или нет
//= ~flags & (mask << shift0);
        int result0 = ((~flags & (mask << shift0)) >>> shift0);
        int result1 = ((~flags & (mask << shift1)) >>> shift1);
        int result2 = ((~flags & (mask << shift2)) >>> shift2);
        int result3 = ((~flags & (mask << shift3)) >>> shift3);
        int result4 = ((~flags & (mask << shift4)) >>> shift4);
        int result5 = ((~flags & (mask << shift5)) >>> shift5);
        int result6 = ((~flags & (mask << shift6)) >>> shift6);
        int result7 = ((~flags & (mask << shift7)) >>> shift7);
        int result8 = ((~flags & (mask << shift8)) >>> shift8);
        int result9 = ((~flags & (mask << shift9)) >>> shift9);
        int result10 = ((~flags & (mask << shift10)) >>> shift10);
        int result11 = ((~flags & (mask << shift11)) >>> shift11);
        int result12 = ((~flags & (mask << shift12)) >>> shift12);
        int result13 = ((~flags & (mask << shift13)) >>> shift13);
        int result14 = ((~flags & (mask << shift14)) >>> shift14);
        int result15 = ((~flags & (mask << shift15)) >>> shift15);
        int result16 = ((~flags & (mask << shift16)) >>> shift16);
        int result17 = ((~flags & (mask << shift17)) >>> shift17);
        int result18 = ((~flags & (mask << shift18)) >>> shift18);
        int result19 = ((~flags & (mask << shift19)) >>> shift19);
        int result20 = ((~flags & (mask << shift20)) >>> shift20);
        int result21 = ((~flags & (mask << shift21)) >>> shift21);
        int result22 = ((~flags & (mask << shift22)) >>> shift22);
        int result23 = ((~flags & (mask << shift23)) >>> shift23);
        int result24 = ((~flags & (mask << shift24)) >>> shift24);
        int result25 = ((~flags & (mask << shift25)) >>> shift25);
        int result26 = ((~flags & (mask << shift26)) >>> shift26);
        int result27 = ((~flags & (mask << shift27)) >>> shift27);
        int result28 = ((~flags & (mask << shift28)) >>> shift28);
        int result29 = ((~flags & (mask << shift29)) >>> shift29);
        int result30 = ((~flags & (mask << shift30)) >>> shift30);
        int result31 = ((~flags & (mask << shift31)) >>> shift31);
        int result32 = ((~flags & (mask << shift32)) >>> shift32);

                int result = result0 + result1 + result2 + result3 + result4 + result5 + result6 + result7 + result8 + result9 + result10 + result11 + result12 + result13 + result14 + result15 + result16 + result17 + result18 + result19 + result20 + result21 + result22 + result23 + result24 + result25 + result26 + result27 + result28 + result29 + result30 + result31 + result32;



                System.out.printf("Вы ввели число: %d \n" +
                        "В двоичном числе %s: \n" +
                "\n %s флагов (нулей) ", flags, Integer.toBinaryString(flags), result);

    }
}


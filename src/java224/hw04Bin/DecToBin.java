package java224.hw04Bin;

import java.util.Scanner;

public class DecToBin {

    public static void main(String[] args) {

        System.out.println("Введите десятичное число: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.close();
        int zeroBit = 32;
        String strZero = "0";

        System.out.println("Вы ввели число       : " + a);
        System.out.println("Инвертированное число: " + (Integer.parseUnsignedInt(Integer.toBinaryString(~a), 2) + 1));
        System.out.println();


        String pluse = strZero.repeat((zeroBit - (Integer.toBinaryString(a)).length())) + "" + Integer.toBinaryString(a);
        String minus = strZero.repeat((zeroBit - (Integer.toBinaryString(~a)).length())) + "" + Integer.toBinaryString(~a);

        System.out.printf("Положительное число: %32s\n",  pluse);
        System.out.printf("Отрицательное число: %32s\n",  minus);

        System.out.println();
        System.out.println("Число было инвертированно");
    }
}

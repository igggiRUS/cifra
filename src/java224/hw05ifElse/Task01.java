package java224.hw05ifElse;

/**
 * Задание 1
 * Числа Фибоначчи – это последовательность чисел, в ко-
 * торой два первых числа последовательности равны 0 и 1, а
 * каждое последующее число равно сумме двух предыдущих.
 * Показать на экране все числа Фибоначчи в диапазоне от
 * 0 до 10 000 000.
 */

public class Task01 {
    public static void main(String[] args) {
        int flagA = 0;
        int flagB = 1;
        int fibonacci = 0;
        int count = 1000;
        for (int i = 0; fibonacci <= count; i++) {
            System.out.printf( "число %d \n", fibonacci);
            fibonacci = flagA + flagB;
            flagA = flagB;
            flagB = fibonacci;

        }
    }
}









package java224.hw05ifElse;

import java.util.Scanner;

// TODO: 1:46 20220615

/**
 * при тестировании циклов надо протестировать
 * что бы выполнилось
 * ни разу
 * один раз
 * несколько раз
 * Упрощение кода do while используется редко
 * но в данном случайе уместно
 * что бы не делать дублирование кода
 */

public class Loop04While {

    public static void main(String[] args) {
//        String referenceEnglish = "blue";
//        String referenceRussian = "синий";
        System.out.println("введите два числа: ");
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int n;

        if (start > end) {
            n = start;
            start = end;
            end = n;
        }
        System.out.printf("%d %d", start, end);
        String message;
        while (start < end) {
            message = "текущий номер start: " + start;
            start++;
        }
        sc.close();
    }
}



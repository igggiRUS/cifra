package java224.hw05ifElse;

import java.util.Scanner;

// TODO: 2:02 20220615

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

public class Loop04DoWhile {

    public static void main(String[] args) {
//        String referenceEnglish = "blue";
//        String referenceRussian = "синий";
        System.out.println("введите два числа: ");
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int number = start;
        String message = "";

        if (start <= end) {
            do {
                message = "current " + start++;
                System.out.println(message);
                number++;
            } while (number <= end);
            System.out.println("number is " + number);
            sc.close();
        }

    }

}




package java224.hw05ifElse;

import java.util.Scanner;

// TODO: 1:30 20220615

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

public class Loop04 {

    public static void main(String[] args) {
        String referenceEnglish = "blue";
        String referenceRussian = "синий";

        Scanner sc = new Scanner(System.in);
        String answer;
        do {
            System.out.printf("напишите перевод слова \"%s\": ", referenceEnglish);
            answer = sc.next();
        } while (!referenceRussian.equalsIgnoreCase(answer));
        sc.close();
        System.out.println("Верно");
    }
}



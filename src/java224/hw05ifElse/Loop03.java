
package java224.hw05ifElse;

import java.util.Scanner;

// TODO: 1:08 20220615
/**
 *  при тестировании циклов надо протестировать
 *  что бы выполнилось
 *  ни разу
 *  один раз
 *  несколько раз
 *  Упрощение кода
 *
 */

public class Loop03 {
    public static void main(String[] args) {
        String referenceEnglish = "blue";
        String referenceRussian = "синий";

        Scanner sc = new Scanner(System.in);
        System.out.printf("напишите перевод слова \"%s\": ", referenceEnglish);
        String answer = sc.next();

        while (!referenceRussian.equalsIgnoreCase(answer)) {
            System.out.println("Неверно");
            System.out.printf("Попробуйте еще раз перевести \"%s\" на русский: ", referenceEnglish);
            answer = sc.next();
        }
        System.out.println("Верно");
        sc.close();
    }
}


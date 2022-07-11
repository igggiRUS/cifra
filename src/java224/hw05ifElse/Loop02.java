package java224.hw05ifElse;

import java.util.Scanner;

public class Loop02 {
    public static void main(String[] args) {
        String referenceEnglish = "blue";
        String referenceRussian = "синий";

        Scanner sc = new Scanner(System.in);

        System.out.printf("напишите перевод слова \"%s\": ", referenceEnglish);
        String answer = sc.next();
        if (referenceRussian.equals(answer)) {
            System.out.println("Верно");
        } else {
            System.out.println("Неверно");
        }

    }
}

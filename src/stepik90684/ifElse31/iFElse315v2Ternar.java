package stepik90684.ifElse31;

import java.util.Scanner;

/*
 * Вычисляем длинну строк
 * решение через тернарный оператор
 */
public class iFElse315v2Ternar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        System.out.print(sc.nextLine().length() > sc.nextLine().length() ? "Махатма" : "Джавахарлал");
    }
}

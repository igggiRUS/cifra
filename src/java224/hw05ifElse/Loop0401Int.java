package java224.hw05ifElse;

import java.util.Scanner;

public class Loop0401Int {
    public static void main(String[] args) {

        String str = "14 10 8";
        Scanner sc = new Scanner(str);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x;
// Если (условие true){ Исполнить }
        // Если (условие false) { Не исполнять }
        if (a > b) {
            x = a;
            a = b;
            b = x;
        }
        if (b > c) {
            x = b;
            b = c;
            c = x;
        }
        if (a > c) {
            x = a;
            a = c;
            c = x;
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

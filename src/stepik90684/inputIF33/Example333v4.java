package stepik90684.inputIF33;

import java.util.Scanner;

public class Example333v4 {
    public static void main(String[] args) {
        String string = "5 10 11";
        Scanner sc = new Scanner(string);
//        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x;

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
        if (a > b) {
            x = a;
            a = b;
            b = x;
        }

        System.out.print(b);


    }
}


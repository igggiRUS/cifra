package stepik90684.inputIF33;

import java.util.Scanner;

public class Example333v2 {
    public static void main(String[] args) {
        String string = "5 10 11";
        Scanner scanner = new Scanner(string);
//        Scanner scanner = new Scanner(System.in);
        String aStr = scanner.next();
        String bStr = scanner.next();
        String cStr = scanner.next();
        scanner.close();
        int a = Integer.parseInt(aStr, 10);
        int b = Integer.parseInt(bStr, 10);
        int c = Integer.parseInt(cStr, 10);
        int n;

//        b > a  b < c
        // сравниваем a и b
        if (a > b) {
            n = a;
            a = b;
            b = n;
        }
        // сравниваем a и c
        if (a > c) {
            n = a;
            a = c;
            c = n;
        }
        // сравниваем b и c
        if (b > c) {
            n = b;
            b = c;
            c = n;
        }
        System.out.println(a+"\n"+b+"\n"+c);
    }
}


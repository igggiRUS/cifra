package stepik90684.inputIF33;

import java.util.Scanner;

public class Example333v3 {
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

             //		a < b < c
        if (((a < b) && (b < c))) {
            System.out.println(bStr);
            //		a < c < b
        } else if (((a < c) && (c < b))) {
            System.out.println(cStr);
//########################################################
            //		b < a < c
        } else if (((b < a) && (a < c))) {
            System.out.println(aStr);
            //		b < c < a
        } else if (((b < c) && (c < a))) {
            System.out.println(cStr);
//########################################################
            //		c < a < b
        } else if (((c < a) && (a < b))) {
            System.out.println(aStr);
            //		c < b < a
        } else if (((c < b) && (b < a))) {
            System.out.println(bStr);
//########################################################
        } else {
            System.out.println("даже не знаю что может случится");

        }
    }
}

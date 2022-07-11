package stepik90684.operator25;

import java.util.Scanner;

public class myNumber2516x03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        int h1 = x / (60 * 60);
        int m1 = (x % (60 * 60)) / 60;
        int s1 = (x % (60 * 60)) % 60;
        int h2 = y / (60 * 60);
        int m2 = (y % (60 * 60)) / 60;
        int s2 = (y % (60 * 60)) % 60;
        System.out.println(h1 + ":" + m1 + ":" + s1);
        System.out.println(String.valueOf("0" + h2 + ":" + "0" + m2 + ":" + "0" + s2));
    }
}
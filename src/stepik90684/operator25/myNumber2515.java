package stepik90684.operator25;

import java.util.Scanner;

public class myNumber2515 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        int z = x / y; // 16 делим на 5 ответ z
        int c = x % y; // 16 делим с остатком на 5 ответ с
        System.out.printf("%d %d%n", z, c);
    }
}

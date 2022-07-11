package stepik90684.operator25;

import java.util.Scanner;

public class myNumber2514 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        int y = 10;
        int myVar = Math.abs(x%y);
        System.out.println(myVar);
    }
}

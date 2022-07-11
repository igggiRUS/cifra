package stepik90684.logic32;

import java.util.Scanner;

public class MyProgram329 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        // буелан возвращает логическое
        boolean z = ((a + b) % 2 == 0 && (a * b) % 2 != 0);
        System.out.println(z);
        // буелан возвращает логическое
     System.out.println((a + b) % 2 == 0 && (a * b) % 2 != 0);
     // тернарный
     System.out.println((a + b) % 2 == 0 && (a * b) % 2 != 0 ? "True Правда" : "False Ложь");
    }
}